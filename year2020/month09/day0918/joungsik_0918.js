const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

const nums = [];
const printMax = (nums) => nums.sort((a, b) => Math.abs(b) - Math.abs(a))[0];
const printMin = (nums) => nums.sort((a, b) => Math.abs(a) - Math.abs(b))[0];

rl.on("line", function (line) {
  if (nums.length >= 1) {
    nums.push(line.split(" ").map((num) => parseFloat(num)));
    console.log(printMax(nums[0]));
    console.log(printMin(nums[1]));
    rl.close();
  } else if (nums.length === 0) {
    nums.push(line.split(" ").map((num) => parseInt(num)));
  }
});
