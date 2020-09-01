const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});
function findMin(ary) {
  if (ary.length == 1) return ary[0];
  else {
    let a = ary.shift();
    let b = ary.shift();
    if (a > b) ary.push(b);
    else ary.push(a);
    return findMin(ary);
  }
}

let numbers = [];
rl.on("line", function(line) {
  let tmp = line.split(' ');
  while(numbers.length < 10 && null != tmp && tmp.length > 0) {
    if (!isNaN(tmp[0])) numbers.push(Number(tmp.shift()));
    else tmp.shift();
  }
  if (numbers.length == 10) {
    console.log(findMin(numbers));
    rl.close();
  }
})

rl.on("close", function() {
  process.exit();
})
