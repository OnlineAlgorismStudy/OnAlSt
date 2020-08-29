const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

const length = 4;
const scores = [];

// arrow function 의 경우에는 앞에 써줘야 함.
const question = (index) => {
  rl.question(`${index}class? `, (line) => {
    scores.push(line.split(" "));
    if (scores.length === length) {
      rl.close();
    } else {
      question(index + 1);
    }
  });
};

question(1);

rl.on("close", () => {
  scores.map((score, index) => {
    console.log(
      `${index + 1}class : ${score.reduce(
        (result, item) => (result += parseInt(item)),
        0
      )}`
    );
  });
});
