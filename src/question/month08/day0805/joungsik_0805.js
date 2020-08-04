const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

const scores = [85.6, 79.5, 83.1, 80.0, 78.2, 75.0];

rl.once("line", (line) => {
  const classs = line.split(" ");
  // 배열.reduce((누적값, 현잿값, 인덱스, 요소) => { return 결과 }, 초깃값);
  const result = scores.reduce((result, cost, index, score) => {
    return (result +=
      index === parseInt(classs[0]) - 1 || index === parseInt(classs[1]) - 1
        ? cost
        : 0);
  }, 0);

  console.log(result.toFixed(1));

  rl.close();
});
