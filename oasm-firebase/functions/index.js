const functions = require("firebase-functions");

// Create and Deploy Your First Cloud Functions
// https://firebase.google.com/docs/functions/write-firebase-functions
// firebase emulators:start
// firebase deploy --only functions

const admin = require("firebase-admin");

const serviceAccount = require("./oasm.json");

admin.initializeApp({
  credential: admin.credential.cert(serviceAccount),
});

const db = admin.firestore();

const is_blank = (value) =>
  value === "" || value === undefined || value === null;

const setDateInfo = async (date) => {
  await db
    .collection("date")
    .doc(date)
    .collection("users")
    .get()
    .then((snapshot) => {
      const dateDocRef = db.collection("date").doc(date);
      dateDocRef.set(
        {
          date: date,
          length: snapshot.docs.length,
        },
        { merge: true }
      );
      return {};
    })
    .catch((err) => {
      console.log("Error getting documents", err);
    });
};

exports.message = functions.https.onRequest((request, response) => {
  const data = request.query;
  if (data.files !== "" && data.files !== undefined && data.files !== null) {
    const files = data.files.split(",");
    files.map((file) => {
      const isALST = RegExp("src/question").test(file);
      const isQuestion = RegExp(".JPG").test(file);
      if (isALST && !isQuestion) {
        const names = file.split("/");

        const date = `2020-${names[2].replace("month", "")}-${names[3]
          .replace("day", "")
          .slice(-2)}`;

        const name = data.name.split("/").pop();

        const docRef = db
          .collection("date")
          .doc(date)
          .collection("users")
          .doc(name);

        docRef
          .set(
            {
              files: admin.firestore.FieldValue.arrayUnion({
                name: names[4],
                upload: data.date,
                extension: names[4].split(".")[1],
              }),
            },
            { merge: true }
          )
          .then(() => {
            setDateInfo(date);
            return {};
          })
          .catch((err) => {
            console.log(err);
          });
      }
    });
  }
  response.send(`${JSON.stringify(data)}"`);
});

exports.user = functions.https.onRequest((request, response) => {
  const data = request.query;
  if (!is_blank(data.name) && !is_blank(data.github)) {
    const docRef = db.collection("users").doc(data.github);
    docRef.set(
      {
        name: data.name,
        github: data.github,
        state: is_blank(data.state) ? 0 : parseInt(data.state),
      },
      { merge: true }
    );
  }
  response.status(200).json(data);
});
