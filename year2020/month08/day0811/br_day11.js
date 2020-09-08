const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

const numbers = [];
let odd = 0;
let even = 0;
rl.on("line", function(line) {
  let tmp = line.split(' ');
  while(numbers.length < 10 && null != tmp && tmp.length > 0) {
    let cur = Number(tmp[0]);
    if (!isNaN(cur)) {
      numbers.push(cur);
    }
    tmp.shift();
  }
  if (numbers.length == 10) {
    // 내림차순 정렬
    numbers.sort(function (a, b) {return b-a;})
    console.log(numbers.join(' '));
    rl.close();
  }
})

rl.on("close", function() {
  process.exit();
})
