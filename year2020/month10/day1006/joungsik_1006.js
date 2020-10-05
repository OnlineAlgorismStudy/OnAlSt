const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

const find = (num) => {
  if (num === 1) {
    return 1;
  } else {
    return (
      find(num / 2 < 1 ? 1 : parseInt(num / 2)) +
      find(num - 1 < 1 ? 1 : num - 1)
    );
  }
};

rl.on("line", function (line) {
  const num = parseInt(line);
  if (num !== undefined && num <= 50) {
    console.log(find(num));
  }
  rl.close();
});
