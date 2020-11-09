const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

rl.on("line", function (line) {
  console.log(parseInt(line) * 2);
  console.log(parseFloat(line).toFixed(2));
  rl.close();
});
