const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

const print = (num) => {
  console.log("recrusive");
  if (num - 1 !== 0) {
    print(num - 1);
  }
};

rl.on("line", function (line) {
  const num = parseInt(line);
  print(num);
  rl.close();
});
