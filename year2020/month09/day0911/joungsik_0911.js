const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

const print = (num) =>
  Array(num)
    .fill()
    .reduce((prev, _, index) => prev + (index + 1), 0);

rl.on("line", function (line) {
  const num = parseInt(line);
  if (num != NaN && num <= 1000) {
    console.log(print(num));
  }

  rl.close();
});
