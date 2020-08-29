const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

rl.once("line", (line) => {
  const words = line.split(" ");
  // 배열.reduce((누적값, 현잿값, 인덱스, 요소) => { return 결과 }, 초깃값);
  console.log(
    words.reduce((result, cost) => {
      return parseInt(result) < parseInt(cost) ? result : cost;
    }, words[0])
  );
  rl.close();
});
