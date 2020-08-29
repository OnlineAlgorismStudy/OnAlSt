const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});


rl.on("line", function(line) {
  line = parseInt(line);
  if (!isNaN(line)) {
    for (let i = 1; i < line; i++) {
      let ary = Array(i).fill().map((_, i) => "#");
      console.log(ary.join(' '));
    }
    for (let i = 0; i < line; i++) {
      let ary = Array(line-i).fill().map((_, i) => "#");
      console.log(ary.join(' ').padStart(2*line-1, ' '));
    }
    rl.close();
  }
})

rl.on("close", function() {
  process.exit();
})
