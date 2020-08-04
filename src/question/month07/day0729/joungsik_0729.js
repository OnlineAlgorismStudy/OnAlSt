const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

rl.once("line", (line) => {
  const count = parseInt(line);
  [...Array(count + count - 1).keys()].forEach((x, index, array) => {
    console.log(
      index + 1 <= count
        ? "# ".repeat(index + 1)
        : "  ".repeat(index + 1 - count) +
            "# ".repeat(count - (index + 1 - count))
    );
  });
  rl.close();
});
