const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

const MAX = 7;

const sort = (nums) => {
  let results = Object.assign([], nums);
  nums.some((_, i) => {
    results = results.reduce((prev, value, index) => {
      if (index + 1 < prev.length) {
        prev[index] = value < prev[index + 1] ? value : prev[index + 1];
        prev[index + 1] = value < prev[index + 1] ? prev[index + 1] : value;
      } else {
        prev[index] = value;
      }
      return prev;
    }, results);
    return i === 2;
  });
  console.log(results.join(" "));
};

rl.on("line", function (line) {
  const nums = line.split(" ").map((l) => parseInt(l));
  if (nums.length === MAX) {
    sort(nums);
  }
  rl.close();
});
