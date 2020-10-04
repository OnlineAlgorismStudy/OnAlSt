const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

const sort = (nums) => {
  let results = Object.assign([], nums);
  nums.map((_, index) => {
    results = results.reduce((prev, value, index) => {
      if (index + 1 < prev.length) {
        prev[index] = value > prev[index + 1] ? value : prev[index + 1];
        prev[index + 1] = value > prev[index + 1] ? prev[index + 1] : value;
      } else {
        prev[index] = value;
      }
      return prev;
    }, results);

    console.log(results.join(" "));
  });
};

rl.on("line", function (line) {
  sort(line.split(" ").map((l) => parseInt(l)));
  rl.close();
});
