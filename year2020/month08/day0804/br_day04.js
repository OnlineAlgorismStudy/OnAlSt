const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

let numbers = Array(100);
rl.on("line", function(line) {
  let tmp = line.split(' ');
  while(numbers[100] == undefined && null != tmp && tmp.length > 0) {
    if (tmp[0] == 0) {
      console.log(numbers.join(' '));
      rl.close();
    }
    else if (!isNaN(tmp[0])) numbers.unshift(tmp.shift());
    else tmp.shift();
  }
  if (numbers[100] != undefined) {
    console.log(numbers.join(' '));
    rl.close();
  }
})

rl.on("close", function() {
  process.exit();
})
