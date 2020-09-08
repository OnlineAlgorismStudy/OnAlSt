const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

let numbers = [];
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
    numbers = numbers.map((x) => {
      if (x%2 == 0) return x/2;
      else return x*2;
    });
    console.log(numbers.length);
    console.log(numbers.join(' '));
    rl.close();
  }
})

rl.on("close", function() {
  process.exit();
})
