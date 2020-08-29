const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

rl.once("line", (line) => {
  const words = line.split(" ");
  if (words.length === 10) {
    console.log(words[0], words[3], words[6]);
  } else {
    console.log("Error");
  }
  rl.close();
});
