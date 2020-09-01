const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

const print = (count) => {
  console.log("~!@#$^&*()_+|");
  if (count > 1) {
    print(count - 1);
  }
};

rl.on("line", function (line) {
  const num = parseInt(line);
  print(num);
  rl.close();
});
