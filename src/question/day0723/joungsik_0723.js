const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

rl.once("line", (line) => {
  const count = parseInt(line);
  [...Array(count + count - 1).keys()].forEach((x, index, array) => {
    if (array.length - index * 2 > 0) {
      console.log(
        `${" ".repeat(index)}${"*".repeat(array.length - index * 2)}`
      );
    } else {
      console.log(
        `${" ".repeat(array.length - index - 1)}${"*".repeat(
          Math.abs(array.length - index * 2) + 2
        )}`
      );
    }
  });
  rl.close();
});
