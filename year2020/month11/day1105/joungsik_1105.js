const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

rl.on("line", function (line) {
  strs.reverse().map((value) => console.log(value));
  rl.close();
});
