const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

rl.on("line", function (line) {
  const result = line.split(" ").reduce((prev, value) => {
    prev *= parseInt(value);
    return prev;
  }, 1);
  console.log(result);
  rl.close();
});
