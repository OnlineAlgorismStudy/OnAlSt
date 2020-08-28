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
    for (let i = line-1; i > 0; i--) console.log("*".repeat(size - (2*(i-1))).padStart(size - i + 1, ' ').padEnd(size, ' '));
    rl.close();
  }
})

rl.on("close", function() {
  process.exit();
})
