const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

const rectangle = {
  width: 0,
  length: 0,
};

rl.on("line", (line) => {
  const words = line.split(" ");
  rectangle.width = parseInt(words[0]) + 5;
  rectangle.length = parseInt(words[1]) * 2;
  rl.close();
});

rl.on("close", () => {
  console.log(`width = ${rectangle.width}`);
  console.log(`length = ${rectangle.length}`);
  console.log(`area = ${rectangle.width * rectangle.length}`);
  process.exit();
});
