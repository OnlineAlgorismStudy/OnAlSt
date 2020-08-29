const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

rl.once("line", (line) => {
  let start = 64;
  const count = parseInt(line);
  if (count >= 3 && count <= 10) {
    [...Array(count).keys()].forEach((x, index, array) => {
      console.log(
        [...Array(array.length - index).keys()]
          .map(() => {
            start += 1;
            return String.fromCharCode(start);
          })
          .join("")
      );
    });
  } else {
    console.log("Error");
  }
  rl.close();
});
