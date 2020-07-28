const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

rl.once("line", (line) => {
  const count = parseInt(line);
  [...Array(count).keys()].forEach((x, index, array) => {
    let nums = [...Array(index + 1).keys()];
    console.log(
      "  ".repeat(array.length - index - 1) +
        nums
          .map((num) => `${num >= 9 ? String(num + 1).slice(-1) : num + 1} `)
          .join("")
    );
  });
  rl.close();
});
