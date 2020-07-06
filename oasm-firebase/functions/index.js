const functions = require("firebase-functions");

// // Create and Deploy Your First Cloud Functions
// // https://firebase.google.com/docs/functions/write-firebase-functions
//

const admin = require("firebase-admin");
admin.initializeApp();

exports.message = functions.https.onRequest((request, response) => {
  const data = request.query;
  console.log(data);
  //   if (!_.isEmpty(data.files)) {
  //     const files = data.files.split(",");

  //     // src / question / day0706 / joungsik_0706.js;
  //     files.map((file) => {
  //       const isALST = RegExp("src/question").test(file);
  //       console.log(isALST);
  //     });
  //   }

  response.send(`${JSON.stringify(data)}"`);
});
