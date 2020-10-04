const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

const fun = (num1, num2) =>
  parseInt(Math.sqrt(num2)) - parseInt(Math.sqrt(num1));

rl.on("line", function (line) {
  const [num1, num2] = [
    parseFloat(line.split(" ")[0]),
    parseFloat(line.split(" ")[1]),
  ];
  console.log(fun(num1, num2));
  rl.close();
});
