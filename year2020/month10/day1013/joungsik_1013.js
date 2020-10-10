const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

const get = (num) => {
  if (num === 1) {
    return 1;
  } else if (num === 2) {
    return 2;
  } else {
    return (get(num - 1) * get(num - 2)) % 100;
  }
};

rl.on("line", function (line) {
  const num = parseInt(line);
  if (num < 100) {
    console.log(get(num));
  }
  rl.close();
});
