const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

rl.once("line", (line) => {
  const words = line.split(" ");

  // 배열.reduce((누적값, 현잿값, 인덱스, 요소) => { return 결과 }, 초깃값);
  const sum = words.reduce((result, cost, index) => {
    return (result += (index + 1) % 2 === 0 ? parseInt(cost) : 0);
  }, 0);

  const avg = words.reduce((result, cost, index) => {
    return (result += (index + 1) % 2 !== 0 ? parseInt(cost) : 0);
  }, 0);

  console.log(
    sum,
    (avg / words.filter((word, index) => (index + 1) % 2 !== 0).length).toFixed(
      1
    )
  );

  rl.close();
});
