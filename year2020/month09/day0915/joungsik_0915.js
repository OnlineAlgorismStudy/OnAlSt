const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

const print = (nums) => {
  const results = nums.sort((a, b) => a - b).map((num) => num * num);
  return results[1] - results[0];
};

rl.on("line", function (line) {
  const nums = line.split(" ").map((num) => parseInt(num));
  console.log(print(nums));
  rl.close();
});
