const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});


rl.on("line", function(line) {
  line = parseInt(line);
  if (!isNaN(line)) {
    let num = 1;
    for (let i = 0; i < line; i++) {
      let ary = Array.from({length: line-i}, (x, i) => num++%10);
      console.log(ary.join(' ').padStart(2*line-1, ' '));
    }
    rl.close();
  }
})

rl.on("close", function() {
  process.exit();
})
