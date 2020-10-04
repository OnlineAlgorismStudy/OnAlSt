const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

const fun1 = (num1, num2) => Math.pow(num1 - num2, 2);
const fun2 = (num1, num2) => Math.pow(num1 + num2, 3);

rl.on("line", function (line) {
  const [num1, num2] = [
    parseInt(line.split(" ")[0]),
    parseInt(line.split(" ")[1]),
  ];

  console.log(`(${num1} - ${num2}) ^ 2 = ${fun1(num1, num2)}`);
  console.log(`(${num1} + ${num2}) ^ 3 = ${fun2(num1, num2)}`);

  rl.close();
});
