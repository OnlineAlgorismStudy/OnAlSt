const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

let cnt = 0;
let max = -1;
let min = 10000;
rl.on("line", function(line) {
  let tmp = line.split(' ');
  while(cnt < 10 && null != tmp && tmp.length > 0) {
    let cur = Number(tmp[0]);
    if (!isNaN(cur) && cur < min && cur > max) {
      if(cur < 100) max < cur ? max = tmp.shift() : tmp.shift();
      else min > cur ? min = tmp.shift() : tmp.shift();
    }
    else tmp.shift();
    cnt++;
  }
  if (cnt == 10) {
    console.log(`${max == -1 ? 100 : max} ${min == 10000 ? 100 : min}`);
    rl.close();
  }
})

rl.on("close", function() {
  process.exit();
})
