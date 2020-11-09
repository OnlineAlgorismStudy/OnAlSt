const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

rl.on("line", function (line) {
  const arrays = line.split(" ");
  console.log(arrays.sort((a, b) => a - b)[0]);
  rl.close();
});
