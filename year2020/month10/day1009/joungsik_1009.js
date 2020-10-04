const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

const even_od_odd = (num) => {
  if (num % 2 === 0) {
    return Array(num)
      .fill()
      .map((_, index) => ((index + 1) % 2 === 0 ? index + 1 : -1))
      .filter((n) => n !== -1)
      .join(" ");
  } else {
    return Array(num)
      .fill()
      .map((_, index) => ((index + 1) % 2 !== 0 ? index + 1 : -1))
      .filter((n) => n !== -1)
      .join(" ");
  }
};

rl.on("line", function (line) {
  const num = parseInt(line);
  console.log(even_od_odd(num));
  rl.close();
});
