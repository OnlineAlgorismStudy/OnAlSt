const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

let tmpary = [];
let stop = false;

function countScores(ary) {
  const rtnary = {};
  ary.forEach(item => {
    const range = Math.floor(item/10);
    rtnary.hasOwnProperty(range) ? rtnary[range]++ : rtnary[range] = 1;
  });
  printAry(rtnary);
}

function printAry(obj) {
  const keys = Object.getOwnPropertyNames(obj);
  keys.sort(function(a,b) {return b-a;});
  keys.forEach(key => {
    console.log(`${key*10} : ${obj[key]} person`);
  })
}

rl.on("line", function(line) {
  let tmp = line.split(' ');
  while(null != tmp && tmp.length > 0) {
    let cur = Number(tmp.shift());
    if (!isNaN(cur)) {
      if (cur == 0) {
        stop = true;
        break;
      }
      tmpary.push(cur);
      if (tmpary.length == 100) {
        stop = true;
        break;
      }
    }
  }

  if (stop) {
    countScores(tmpary);
    rl.close();
  }
})

rl.on("close", function() {
  process.exit();
})
