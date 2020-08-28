const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

rl.on("line", function(line) {
  line = parseInt(line);
  if (!isNaN(line)) {
    for (let i = 1; i < line; i++) console.log("*".repeat(i));
    for (let i = 0; i < line; i++) console.log("*".repeat(line-i));
    rl.close();
  }
})

rl.on("close", function() {
  process.exit();
})
