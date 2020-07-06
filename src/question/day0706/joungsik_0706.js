const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

const isNumber = (value) => typeof value === "number" && isFinite(value);

rl.on("line", function (line) {
  try {
    const year = parseInt(line);
    if (!isNumber(line)) {
      throw Error;
    }

    if (year % 400 === 0 || (year % 4 === 0 && year % 100 !== 0)) {
      console.log("leap year");
    } else {
      console.log("common year");
    }
  } catch (e) {
    console.log("숫자만 입력!");
  }
  rl.close();
});
