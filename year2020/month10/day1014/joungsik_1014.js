const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

const get = (num, count) =>
  num === 1
    ? count
    : get(num % 2 === 0 ? parseInt(num / 2) : parseInt(num / 3), count + 1);

rl.on("line", function (line) {
  const num = parseInt(line);
  if (num <= 1000000) {
    console.log(get(num, 0));
  }
  rl.close();
});
