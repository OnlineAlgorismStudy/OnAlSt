const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

rl.once("line", (line) => {
  let number = 0;
  let word = 64;
  const count = parseInt(line);

  [...Array(count).keys()].forEach((x, index_x, array_x) => {
    console.log(
      [...Array(count + 1).keys()]
        .map((y) =>
          x + y - count < 0 ? (number += 1) : String.fromCharCode((word += 1))
        )
        .join(" ")
    );
  });
  rl.close();
});
