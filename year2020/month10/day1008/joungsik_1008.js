const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

const num = 100;

const print = (start, num) => {
  if (start === num) {
    return num;
  } else if (start + 1 === num) {
    return `${parseInt(num / 2)} ${print(start + 1, num)}`;
  } else {
    return `${start} ${print(start + 1, num)}`;
  }
};

console.log(print(1, num));

process.exit();

// rl.on("line", function (line) {
//   rl.close();
// });
