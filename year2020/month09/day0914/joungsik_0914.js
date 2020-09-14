const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

const range = (num) =>
  Array(num)
    .fill()
    .map((_, index) => index + 1);

const print = (num) => {
  console.log(
    range(num).map((value) =>
      console.log(
        range(num)
          .map((item) => value * item)
          .join(" ")
      )
    )
  );
};

rl.on("line", function (line) {
  const num = parseInt(line);
  if (num != NaN && num <= 1000) {
    print(num);
  }

  rl.close();
});
