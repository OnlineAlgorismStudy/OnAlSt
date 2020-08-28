const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});


rl.on("line", function(line) {
  line = parseInt(line);
  if (!isNaN(line)) {
    for (let i = 0; i < line; i++) {
      let ary = Array.from({length: i+1}, (x, i) => (i+1)%10);
      // ary = Array(i+1).fill().map((_, i) => i+1);
      console.log(ary.join(' ').padStart(2*line-1, ' '));
    }
    rl.close();
  }
})

rl.on("close", function() {
  process.exit();
})
