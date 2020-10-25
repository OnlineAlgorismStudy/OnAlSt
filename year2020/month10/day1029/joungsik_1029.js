const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

rl.on("line", function (line) {
  new Array(line.length).fill().map((_, index) => {
    console.log(
      `${line.substring(
        line.length - (index + 1),
        line.length
      )}${line.substring(0, line.length - index - 1)}`
    );
  });
  rl.close();
});
