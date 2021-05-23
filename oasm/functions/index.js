const functions = require("firebase-functions");
const admin = require("firebase-admin");
const express = require("express");

admin.initializeApp();
const app = express();

const indexRouter = require("./routers/index");

app.use("/", indexRouter);

module.exports.v1 = functions.https.onRequest(app);
