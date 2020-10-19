const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

const repeat = (str) => str.repeat(2);

rl.on("line", function (line) {
  const str = line;
  console.log(repeat(str));
  rl.close();
});
