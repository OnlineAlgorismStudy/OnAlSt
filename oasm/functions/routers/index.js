const functions = require('firebase-functions');
const router = require("express").Router();

router.get("/", (req, res) => {
  res.status(200).json({ msg: "Hello World!" });
});

module.exports = router;
