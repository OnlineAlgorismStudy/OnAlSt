const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

rl.on("line", function (line) {
  const [str1, str2] = line.split(" ");
  console.log(
    str1.substring(0, 2) + str2.substring(2, str2.length) + str1.substring(0, 2)
  );
  rl.close();
});
