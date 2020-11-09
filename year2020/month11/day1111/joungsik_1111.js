const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

rl.on("line", function (line) {
  const check1 = /c/.test(line) ? "Yes" : "No";
  const check2 = /ab/.test(line) ? "Yes" : "No";
  console.log(check1, check2);
  rl.close();
});
