const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

let strs = [];
let char = "";
let string = "";

rl.on("line", function (line) {
  if (strs.length < 4) {
    strs.push(line);
  } else if (char === "") {
    char = line;
  } else if (string === "") {
    string = line;
    rl.close();
  }
});

rl.on("close", () => {
  strs
    .filter((str) => str.match(char) || str.match(string))
    .map((str) => console.log(str));
});
