const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

const sum = (str1, str2) => str1.length + str2.length;

rl.on("line", function (line) {
  const [str1, str2] = [line.split(" ")[0], line.split(" ")[1]];
  console.log(sum(str1, str2));
  rl.close();
});
