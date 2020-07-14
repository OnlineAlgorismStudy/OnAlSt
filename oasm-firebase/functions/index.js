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

exports.message = functions.https.onRequest((request, response) => {
  const data = request.query;

  const files = data.files.split(",");
  files.map((file) => {
    const isALST = RegExp("src/question").test(file);
    if (isALST) {
      db.ref("users").once("value", (value) => {
        const array = [];
        Object.keys(value.val()).map((key) => {
          return array.push({
            key: key,
            value: value.val()[key],
          });
        });
        const user = array.find((item) => item.value.github === data.name);

        const names = file.split("/");
        const date =
          "2020-" +
          names[2]
            .replace("day", "")
            .replace(/(\d{2})(\d{1,2})/, ($f, $1, $2) =>
              $f.replace($1, $1 + "-")
            );

        db.ref("files")
          .child(date)
          .child(user.key)
          .set(
            JSON.parse(
              JSON.stringify({
                date: date,
                extension: names[3].split(".")[1],
                message: data.message,
                name: file,
                upload: data.date,
                user: user.key,
              })
            )
          );
        return {};
      });
    }
    return [];
  });

  response.send(`${JSON.stringify(data)}`);
});
