const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

const arrays1 = [];
const arrays2 = [];

const question_first = () => {
  rl.question(arrays1.length == 0 ? "first array\n" : "", (line) => {
    arrays1.push(line.split(" "));
    if (arrays1.length == 2) {
      question_second();
    } else {
      question_first();
    }
  });
};

const question_second = () => {
  rl.question(arrays2.length == 0 ? "second array\n" : "", (line) => {
    arrays2.push(line.split(" "));
    if (arrays2.length == 2) {
      rl.close();
    } else {
      question_second();
    }
  });
};

question_first();
rl.on("close", () => {
  arrays1.map((array, array_index) => {
    console.log(array.map((num, index) => num * arrays2[array_index][index]));
  });
});
