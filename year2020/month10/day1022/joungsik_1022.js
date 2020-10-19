const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

const print = (str, num) => {
  if (str.length < num) {
    console.log(str.split("").reverse().join(""));
  } else {
    console.log(str.split("").reverse().join("").substring(0, num));
  }
};

rl.on("line", function (line) {
  const [str, num] = [line.split(" ")[0], parseInt(line.split(" ")[1])];

  print(str, num);

  rl.close();
});
