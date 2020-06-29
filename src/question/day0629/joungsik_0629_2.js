// const readline = require("readline");
// const rl = readline.createInterface({
//   input: process.stdin,
//   output: process.stdout,
// });

// const length = 3;
// const number = [];

// rl.on("line", function (line) {
//   const word = line.split(" ");
//   if (word.length > 1) {
//     number.push({ name: word[0], score: parseInt(word[1]) });
//   } else {
//     console.log("다시 입력 해주세요. format('과목명 숫자')");
//   }
//   if (number.length == length) {
//     rl.close();
//   }
// }).on("close", function () {
//   const result = number.reduce(
//     (result, nextSubject) => (result += nextSubject.score),
//     0
//   );
//   console.log("sum ", result);
//   console.log("avg ", result / length);
//   process.exit();
// });

const score = [
  {
    name: "kor",
    score: 90,
  },
  {
    name: "mat",
    score: 80,
  },
  {
    name: "eng",
    score: 100,
  },
];

score.map((subject) => console.log(`${subject.name} ${subject.score}`));
const sum = score.reduce((result, next) => (result += next.score), 0);
console.log("sum ", sum);
console.log("avg ", sum / score.length);
