const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

let result = [];

rl.on("line", (line) => {
  result.push(line.split(" "));
  if (result.length === 3) {
    rl.close();
  }
});

rl.on("close", () => {
  result.map((array) =>
    console.log(array.map((key) => key.toLowerCase()).join(" "))
  );
});
