const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

const print = (num) => {
  console.log((num * num * 3.14).toFixed(2));
};

rl.on("line", function (line) {
  const num = parseInt(line);
  print(num);
  rl.close();
});
