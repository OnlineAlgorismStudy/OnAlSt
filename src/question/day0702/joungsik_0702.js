const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

const YD = 91.44;
const isFloat = (value) => RegExp("[0-9]*[.][0-9]+").test(value);
const convertYdCm = (value) => (YD * parseFloat(value)).toFixed(1);
const requestQuestion = () => {
  rl.question("yard? ", (value) => {
    if (isFloat(value)) {
      console.log(`${value}yard = ${convertYdCm(value)}cm`);
      rl.close();
    } else {
      console.log("입력 포맷 오류,", value);
      requestQuestion();
    }
  });
};

rl.on("close", () => {
  process.exit();
});

requestQuestion();
