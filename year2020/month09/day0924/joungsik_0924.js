const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

const fun = (nums) =>
  nums.reduce((prev, value) => (prev += Math.abs(value)), 0);

rl.on("line", function (line) {
  const nums = line.split(" ").map((l) => parseInt(l));
  console.log(fun(nums));
  rl.close();
});
