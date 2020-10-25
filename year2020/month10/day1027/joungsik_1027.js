const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

const regex = /[0-9\W]*/g;

rl.on("line", function (line) {
  console.log(line.replace(regex, "").toUpperCase());
  rl.close();
});
