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

        const docRef = db
          .collection(date)
          .doc(data.name)
          .collection("files")
          .doc(names[4].split(".")[1]);

        docRef.set({
          name: names[4],
          upload: data.date,
        });
      }
    });
  }
  response.send(`${JSON.stringify(data)}"`);
});
