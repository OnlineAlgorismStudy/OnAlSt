const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

rl.on("line", function (line) {
  const [str1, str2] = line.split(" ");
  console.log(str1.length > str2.length ? str1.length : str2.length);
  rl.close();
});
