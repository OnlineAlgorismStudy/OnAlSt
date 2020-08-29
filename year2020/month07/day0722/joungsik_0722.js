const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

rl.once("line", (line) => {
  const count = parseInt(line);
  [...Array(count + count - 1).keys()].forEach((x, index, array) => {
    console.log(
      array.length - index < count
        ? "*".repeat(array.length - index)
        : "*".repeat(index + 1)
    );
  });
  rl.close();
});
