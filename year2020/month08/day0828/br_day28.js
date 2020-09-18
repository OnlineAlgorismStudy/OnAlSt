const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

let aryresult = [];
let tmpary = [];
let cnt = 0;

function printAvgs(ary) {
  let col = [0, 0];
  let row = [0, 0, 0, 0];
  let tot = 0;
  ary.forEach((innerAry, r) => {
    innerAry.forEach((num, c) => {
      col[c] += num;
      row[r] += num;
      tot += num;
    });
  });

  col = col.map((num) => {return Math.floor(num/row.length);});
  row = row.map((num) => {return Math.floor(num/col.length);});
  tot = Math.floor(tot/(col.length*row.length));
  console.log(row.join(" "));
  console.log(col.join(" "));
  console.log(tot);
}

rl.on("line", function(line) {
  let tmp = line.split(' ');
  while(aryresult.length < 4 && null != tmp && tmp.length > 0) {
    let cur = Number(tmp.shift());
    if (!isNaN(cur)) {
      tmpary.push(cur);
    }
    if (tmpary.length == 2) {
      aryresult.push(tmpary);
      tmpary = [];
    }
  }

  if (aryresult.length == 4) {
    printAvgs(aryresult);
    rl.close();
  }
});

rl.on("close", function() {
  process.exit();
});
