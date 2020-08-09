const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

rl.once("line", (line) => {
  const words = line.split(" ");

  console.log(
    words
      .sort((num1, num2) => {
        return parseInt(num2) - parseInt(num1);
      })
      .join(" ")
  );

  rl.close();
});
