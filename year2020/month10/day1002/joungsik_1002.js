const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

const print = (num) => {
  let result = `${num}`;
  if (num === 1) {
    return result;
  } else {
    return result + ` ${print(num - 1)}`;
  }
};

rl.on("line", function (line) {
  const num = parseInt(line);
  if (num <= 50) {
    console.log(print(num));
  }
  rl.close();
});
