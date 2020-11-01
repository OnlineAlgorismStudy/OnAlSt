const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

rl.on("line", function (line) {
  line.split(" ").map((value, index) => {
    if (index % 2 === 0) {
      console.log(value);
    }
  });
  rl.close();
});
