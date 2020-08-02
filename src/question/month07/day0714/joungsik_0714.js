const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

rl.once("line", (line) => {
  const count = parseInt(line);
  [...Array(count).keys()].map((x, index) => {
    console.log("*".repeat(index + 1));
  });
  rl.close();
});
