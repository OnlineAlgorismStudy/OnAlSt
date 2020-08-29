const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

rl.once("line", (line) => {
  const count = parseInt(line);
  let key = 0;
  [...Array(count).keys()].forEach((x, index, array) => {
    let nums = [...Array(array.length - index).keys()];
    console.log(
      "  ".repeat(index) +
        nums
          .map((num) => {
            key += 1;
            return String(key).slice(-1);
          })
          .join(" ")
    );
  });
  rl.close();
});
