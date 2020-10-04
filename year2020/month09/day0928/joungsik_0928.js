const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

const nums = [153.74, 34.59, 109.5];

const before = (nums) =>
  Math.round(nums.reduce((prev, value) => (prev += value), 0) / nums.length);

const after = (nums) =>
  Math.round(
    nums.reduce((prev, value) => (prev += Math.round(value)), 0) / nums.length
  );

rl.on("line", function (line) {
  const nums = line.split(" ").map((l) => parseFloat(l));
  console.log(before(nums));
  console.log(after(nums));
  rl.close();
});
