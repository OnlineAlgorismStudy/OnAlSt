const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

const print = (nums) => {
  const result = nums.reduce((prev, value) => (prev < parseInt(value) ? parseInt(value) : prev), 0);
  console.log(result);
};

rl.on("line", function (line) {
  const nums = line.split(" ");
  print(nums);
  rl.close();
});
