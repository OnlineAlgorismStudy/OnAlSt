const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

const regex = /\W/g;

rl.on("line", function (line) {
  console.log(line.replace(regex, "").toLowerCase());
  rl.close();
});
