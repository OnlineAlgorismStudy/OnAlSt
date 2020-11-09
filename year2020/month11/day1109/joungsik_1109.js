const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

rl.on("line", function (line) {
  const str = line + "fighting";
  console.log(str);
  rl.close();
});
