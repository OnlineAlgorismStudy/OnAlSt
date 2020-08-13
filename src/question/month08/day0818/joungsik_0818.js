const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});
rl.on("line", (line) => {
  const count = parseInt(line);
  if (!isNaN(count) && count <= 20) {
    rl.once("line", (line) => {
      const nums = line.split(" ");
      if (count === nums.length) {
        nums.sort((a, b) => b - a).map((num) => console.log(num));
      } else {
        rl.close();
      }
    });
  } else {
    rl.close();
  }
});
