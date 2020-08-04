const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

rl.once("line", (line) => {
  const count = parseInt(line);

  [...Array(count).keys()].forEach((x, index, array) => {
    console.log("*".repeat(array.length - index));
  });
  [...Array(count).keys()].forEach((x, index, array) => {
    console.log("*".repeat(index + 1));
  });

  rl.close();
});
