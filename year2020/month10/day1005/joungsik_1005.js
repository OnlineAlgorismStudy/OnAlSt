const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

const add = (num) => num + (num === 0 ? 0 : add(num - 1));

rl.on("line", function (line) {
  const num = parseInt(line);
  console.log(add(num));
  rl.close();
});
