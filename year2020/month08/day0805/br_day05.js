const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

const scores = [85.6, 79.5, 83.1, 80.0, 78.2, 75.0];
let classes = [];
rl.on("line", function(line) {
  let tmp = line.split(' ');
  while(classes.length < 2 && null != tmp && tmp.length > 0) {
    if (!isNaN(tmp[0]) && tmp[0] > 0 && tmp[0] < 7) classes.unshift(tmp.shift());
    else tmp.shift();
  }
  if (classes.length == 2) {
    console.log((scores[classes[0]-1] + scores[classes[1]-1]).toFixed(1));
    rl.close();
  }
})

rl.on("close", function() {
  process.exit();
})
