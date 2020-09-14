const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

let length = -1;
const print = (nums) => console.log(nums.sort((a, b) => b - a).join(" "));

rl.on("line", function (line) {
  if (length === -1) {
    length = parseInt(line);
  } else if (length === line.split(" ").length) {
    const nums = line.split(" ").map((num) => parseInt(num));
    print(nums);
    rl.close();
  } else {
    length = -1;
  }
});
