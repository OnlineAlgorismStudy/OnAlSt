const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

const print = (nums) => {
  const results = nums.map((num) =>
    num.concat(num.reduce((prev, value) => prev + value, 0))
  );

  console.log(
    results
      .reduce((prev, value) => {
        console.log(value.join(" "));
        if (prev.length === 0) {
          prev = value;
          return prev;
        } else {
          return prev.map((p, index) => p + value[index]);
        }
      }, [])
      .join(" ")
  );
};

const nums = [];
rl.on("line", function (line) {
  nums.push(line.split(" ").map((num) => parseInt(num)));
  if (nums.length >= 3) {
    print(nums);
    rl.close();
  }
});
