const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

const result = (nums) => {
  if (parseInt(nums[0]) > parseInt(nums[1])) {
    nums[0] = parseInt(nums[0]) / 2;
    nums[1] = parseInt(nums[1]) * 2;
  } else {
    nums[1] = parseInt(nums[1]) / 2;
    nums[0] = parseInt(nums[0]) * 2;
  }
  return nums;
};

rl.on("line", function (line) {
  const nums = line.split(" ");
  console.log(result(nums).join(" "));
  rl.close();
});
