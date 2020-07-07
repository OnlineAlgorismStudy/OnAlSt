const functions = require("firebase-functions");

// // Create and Deploy Your First Cloud Functions
// // https://firebase.google.com/docs/functions/write-firebase-functions

const admin = require("firebase-admin");

const serviceAccount = require("./oasm.json");

admin.initializeApp({
  credential: admin.credential.cert(serviceAccount),
  databaseURL: "https://oasm-889a7.firebaseio.com/",
});

const db = admin.database();
const ref = db.ref("users");

exports.message = functions.https.onRequest((request, response) => {
  const data = request.query;
  console.log(data);
  if (data.files !== "" && data.files !== undefined && data.files !== null) {
    const files = data.files.split(",");
    files.map((file) => {
      const isALST = RegExp("src/question").test(file);
      if (isALST) {
        const names = file.split("/");
        const date =
          "2020-" +
          names[2]
            .replace("day", "")
            .replace(/(\d{2})(\d{1,2})/, ($f, $1, $2) =>
              $f.replace($1, $1 + "-")
            );

        db.ref("files")
          .child(names[3].split(".")[0])
          .set(
            JSON.parse(
              JSON.stringify({
                date: date,
                extension: names[3].split(".")[1],
                message: data.message,
                upload: data.date,
                user: data.name,
              })
            )
          );
      }
    });
  }
  response.send(`${JSON.stringify(data)}"`);
});
