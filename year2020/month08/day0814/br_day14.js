const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

const numbers = [];
let stop = false;
rl.on("line", function(line) {
  let tmp = line.split(' ');
  while(null != tmp && tmp.length > 0) {
    let cur = Number(tmp[0]);
    if (!isNaN(cur)) {
      if (numbers.length >= 100 || cur == 0) {
        stop = true;
        break;
      }
      else numbers.push(cur);
    }
    tmp.shift();
  }
  if (stop) {
    let cnt = 0;
    let sum = 0;
    numbers.forEach(function(x) {
      if (x%5 == 0) {
        cnt++;
        sum += x;
      }
    });
    console.log(`Multiples of 5 : ${cnt}\nsum : ${sum}\navg : ${(sum/cnt).toFixed(1)}`);
    rl.close();
  }
})

rl.on("close", function() {
  process.exit();
})
