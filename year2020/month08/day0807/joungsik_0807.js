const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

rl.once("line", (line) => {
  const words = line.split(" ");

  const check = words.reduce((result, cost) => {
    return cost < 1 || cost > 10000;
  }, false);

  if (check) {
    console.log(100, 100);
  } else {
    // 배열.reduce((누적값, 현잿값, 인덱스, 요소) => { return 결과 }, 초깃값);
    const max = words.reduce((result, cost) => {
      if (parseInt(cost) < 100) {
        return parseInt(result) > parseInt(cost) ? result : cost;
      } else {
        return parseInt(result) === -1 ? 100 : result;
      }
    }, -1);

    const min = words.reduce((result, cost, index) => {
      if (parseInt(cost) > 99 && parseInt(cost) < 9999) {
        return parseInt(result) < parseInt(cost) ? result : cost;
      } else {
        return parseInt(result) === 9999 && index === words.length - 1
          ? 100
          : result;
      }
    }, 9999);

    console.log(max, min);
  }

  rl.close();
});
