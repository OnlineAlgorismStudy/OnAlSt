const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

rl.on("line", function (line) {
  let [num, float, string] = line.split(" ");
  num = parseInt(num);
  float = parseFloat(float);

  const str = String(num) + String(float.toFixed(3)) + string;

  if (str.length % 2 === 0) {
    console.log(str.substr(0, str.length / 2));
    console.log(str.substr(str.length / 2, str.length));
  } else {
    console.log(str.substr(0, str.length / 2 + 1));
    console.log(str.substr(str.length / 2 + 1, str.length));
  }

  rl.close();
});
