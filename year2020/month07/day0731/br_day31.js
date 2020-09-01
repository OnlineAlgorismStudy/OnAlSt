const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

Array.prototype.convertAry = function() {
  let ary = Object(this);
  let s = Number(ary[0]);
  let e = Number(ary[1]);
  let len = Math.abs(s-e)+1;
  ary = s > e ? Array.from({length: len}, (x, i) => s-i)
  : Array.from({length: len}, (x, i) => s+i);
  return ary;
}

let fromto = [];
rl.on("line", function(line) {
  let tmp = line.split(' ');
  while(fromto.length < 2 && null != tmp && tmp.length > 0) {
    if (!isNaN(tmp[0]) && tmp[0] >= 2 && tmp[0] <= 9) fromto.push(tmp.shift());
    else {
      fromto = [];
      tmp = [];
      console.log('INPUT ERROR!');
    }
  }
  if (fromto.length == 2) {
    fromto = fromto.convertAry();
    [...Array(9).keys()].forEach((x, index, array) => {
      let str = [];
      for (let num of fromto) {
        str.push(`${num} * ${index+1} = ${(num*(index+1)).toString().padStart(2, ' ')}`);
      }
      console.log(str.join('   '));
    });
    rl.close();
  }
})

rl.on("close", function() {
  process.exit();
})
