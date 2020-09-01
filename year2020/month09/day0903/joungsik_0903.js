const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

const print = (nums) => {
  let index = 1;
  Array(n)
    .fill()
    .map((_, i) =>
      console.log(
        Array(n)
          .fill()
          .map((_, i) => index++)
          .join(" ")
      )
    );
};

rl.on("line", function (line) {
  const nums = line.split(" ");
  print(nums);
  rl.close();
});
