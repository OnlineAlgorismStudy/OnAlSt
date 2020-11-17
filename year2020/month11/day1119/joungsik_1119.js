const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

let strs = [];

rl.on("line", function (line) {
  if (line === "0") {
    rl.close();
  } else {
    strs.push(line);
  }
});

rl.on("close", () => {
  console.log(strs.length);
  strs.map((value, index) => {
    if (index % 2 === 0) {
      console.log(value);
    }
  });
});
