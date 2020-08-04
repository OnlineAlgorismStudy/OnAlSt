const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

rl.once("line", (line) => {
  const count = parseInt(line);
  [...Array(count).keys()].forEach((x, index, array) => {
    const max = count + count - 1;
    console.log(
      `${" ".repeat(max - index * 2 - 1)}${"*".repeat(index * 2 + 1)}`
    );
  });
  rl.close();
});
