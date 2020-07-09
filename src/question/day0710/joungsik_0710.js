const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

let count = 10;
let result = 0;

const requestSubjectCount = () => {
  rl.once("line", (line) => {
    count = parseInt(line);
    if (count >= 10) {
      console.log("Error, 10개 초과의 과목 수는 입력 할 수 없습니다.");
      requestSubjectCount();
    } else {
      requestSubjectScores();
    }
  });
};

const requestSubjectScores = () => {
  rl.once("line", (scores) => {
    const results = scores.split(" ");
    if (results.length !== count) {
      console.log("입력한 과목 수와 점수의 갯수가 맞지 않습니다.");
      requestSubjectScores();
    } else {
      rl.close();
      results.map((score) => (result += parseInt(score)));
      result = (result / results.length).toFixed(1);
      console.log(`avg : ${result}`);
      check(result);
    }
  });
};

const check = (score) => {
  if (score >= 80) {
    console.log("pass");
  } else {
    console.log("fail");
  }
};

requestSubjectCount();
