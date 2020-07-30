const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

rl.once("line", (line) => {
  const count = parseInt(line);
  let key = 10;
  [...Array(count).keys()].forEach((x, index, array) => {
    console.log(
      [...Array(count).keys()]
        .map((num) => {
          if (key + 2 > 10) {
            key = 1;
          } else {
            key += 2;
          }
          return key;
        })
        .join(" ")
    );
  });
  rl.close();
});
