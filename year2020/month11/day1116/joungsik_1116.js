const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

const num = ["12", "5963", "58", "1", "45678"];

console.log(num.join(""));

rl.on("line", function (line) {
  const nums = line.split(" ");
  console.log(
    nums
      .join("")
      .split("")
      .reduce((prev, value) => {
        if (prev.length > 2) {
          console.log(prev);
          prev = "";
        }
        prev += value;
        return prev;
      }, "")
  );
  rl.close();
});
