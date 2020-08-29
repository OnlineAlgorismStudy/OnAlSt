const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});


rl.on("line", function(line) {
  line = parseInt(line);
  if (!isNaN(line)) {
    for (let i = 0; i < line; i++) {
      let str = "*".repeat(2*i+1);
      console.log(str.padStart(2*line-1, ' '));
    }
    rl.close();
  }
})

rl.on("close", function() {
  process.exit();
})
