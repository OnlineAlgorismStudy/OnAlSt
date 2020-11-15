const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

rl.on("line", function (line) {
  const strs = line.split(" ");
  strs.reverse().map((str) => console.log(str));
  rl.close();
});
