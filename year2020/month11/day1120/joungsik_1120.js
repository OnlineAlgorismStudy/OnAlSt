const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

let num = 0;
let count = 0;
let strs = [];

rl.on("line", function (line) {
  if (num === 0) {
    num = parseInt(line);
  }

  if (isNaN(parseInt(line))) {
    strs.push(line);
    count += 1;
  }

  if (count === num) {
    rl.close();
  }
});

rl.on("close", () => {
  strs
    .sort((a, b) => a.charCodeAt(0) - b.charCodeAt(0))
    .map((str) => console.log(str));
});
