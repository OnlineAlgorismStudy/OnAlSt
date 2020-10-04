const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

const fun = (num) => Math.pow(2, num);

rl.on("line", function (line) {
  const num = parseInt(line);
  if (num >= 1 && num <= 20) {
    console.log(fun(num));
  }
  rl.close();
});
