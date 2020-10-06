const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

const pow = (num) =>
  num > 10
    ? pow(parseInt(num / 10)) + Math.pow(parseInt(num % 10), 2)
    : Math.pow(num, 2);

rl.on("line", function (line) {
  const num = parseInt(line);
  if (parseInt(num / (10 * 9)) > 0) {
    console.log(pow(num));
  }
  rl.close();
});
