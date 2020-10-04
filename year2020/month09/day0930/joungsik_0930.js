const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

const PI = 3.141592;
const FUN = (radius) => (radius * radius * PI).toFixed(3);

rl.question("radius : ", function (line) {
  const radius = parseFloat(line);
  console.log(`area = ${FUN(radius)}`);
  rl.close();
});
