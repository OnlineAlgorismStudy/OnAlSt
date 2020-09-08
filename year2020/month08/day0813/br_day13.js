const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

const numbers = [];
let stop = false;
let min = 0;
let max = 0;
rl.on("line", function(line) {
  let tmp = line.split(' ');
  while(null != tmp && tmp.length > 0) {
    let cur = Number(tmp[0]);
    if (!isNaN(cur)) {
      if (numbers.length >= 100 || cur == 999) {
        stop = true;
        break;
      }
      else if (cur < 1000 && cur > -1000) numbers.push(cur);
    }
    tmp.shift();
  }
  if (stop) {
    max = Math.max.apply(null, numbers);
    min = Math.min.apply(null, numbers);
    console.log(`max : ${max}\nmin : ${min}`);
    rl.close();
  }
})

rl.on("close", function() {
  process.exit();
})
