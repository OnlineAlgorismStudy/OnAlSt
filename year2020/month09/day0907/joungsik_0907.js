const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

const print = (num, index) => {
  return index !== 0 ? num * print(num, index - 1) : 1;
};

rl.on("line", function (line) {
  const nums = line.split(" ");
  const num = parseInt(nums[0]);
  const index = parseInt(nums[1]);
  console.log(print(num, index));
  rl.close();
});
