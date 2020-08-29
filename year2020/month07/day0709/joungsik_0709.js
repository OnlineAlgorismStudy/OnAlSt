const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

const questions = ["Base", "Height"];
let answer = [0, 0];

const requestQuestion = () => {
  rl.question("Base = ", (base) => {
    rl.question("Height = ", (height) => {
      answer = [parseInt(base), parseInt(height)];
      const result = ((answer[0] * answer[1]) / 2).toFixed(1);
      console.log(`Triangle width = ${result}`);

      rl.question("Continue? ", (answer) => {
        if (answer.toUpperCase() === "Y") {
          requestQuestion();
        } else {
          rl.close();
        }
      });
    });
  });
};

requestQuestion();
