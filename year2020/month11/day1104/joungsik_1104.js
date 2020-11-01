const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

rl.on("line", function (line) {
  line.split(" ").map((value, index) => console.log(`${index + 1}. ${value}`));
  rl.close();
});
