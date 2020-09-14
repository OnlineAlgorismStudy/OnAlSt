const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

const range = (start, end) =>
  Array(end - start + 1)
    .fill()
    .map((_, idx) => start + idx);

const print = (min, max) => {
  range(min, max).map((num) => {
    console.log(`== ${num}dan ==`);
    range(1, 9).map((word) => {
      console.log(`${num} * ${word} = ${num * word > 9 ? num * word : " " + num * word}`);
    });
  });
};

rl.on("line", function (line) {
  const nums = line.split(" ").map((num) => parseInt(num));
  print(Math.min(...nums), Math.max(...nums));
  rl.close();
});
