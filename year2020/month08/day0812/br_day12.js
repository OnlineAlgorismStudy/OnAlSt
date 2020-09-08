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
    odd = numbers[0] + numbers[2] + numbers[4] + numbers[6] + numbers[8];
    even = numbers[1] + numbers[3] + numbers[5] + numbers[7] + numbers[9];
    console.log(`odd : ${odd}\neven : ${even}`);
    rl.close();
  }
})

rl.on("close", function() {
  process.exit();
})
