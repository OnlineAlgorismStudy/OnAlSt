const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});


rl.on("line", function(line) {
  line = parseInt(line);
  if (!isNaN(line)) {
    let num = 0;
    for (let i = 0; i < line; i++) {
      let ary = Array(line).fill().map((_, i) => (num++*2+1)%10);
      console.log(ary.join(' '));
    }
    rl.close();
  }
})

rl.on("close", function() {
  process.exit();
})
