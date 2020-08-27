const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

rl.on("line", function(line) {
  line = parseInt(line);
  if (!isNaN(line)) {
    let size = 2 * line - 1;
    for (let i = 0; i < line; i++) console.log("*".repeat(size - (2*i)).padStart(size - i, ' ').padEnd(size, ' '));
    rl.close();
  }
})
