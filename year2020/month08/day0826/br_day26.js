const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

let resultAry = {};
let stuCnt = 0;

function askScore(clsNum) {
  rl.question(clsNum + "class? ", function(line) {
    let tmp = line.split(' ');
    while(stuCnt < 3 && null != tmp && tmp.length > 0) {
      let cur = Number(tmp.shift());
      if (!isNaN(cur)) {
        resultAry.hasOwnProperty(clsNum) ? resultAry[clsNum] += cur : resultAry[clsNum] = cur;
        if (++stuCnt == 3) {
          if (clsNum == 4) {
            printAry(resultAry);
            rl.close();
          } else {
            stuCnt = 0;
            askScore(++clsNum);
            break;
          }
        }
      }
    }
  });
}

function printAry(obj) {
  const keys = Object.getOwnPropertyNames(obj);
  keys.sort(function(a,b) {return a-b;});
  keys.forEach(key => {
    console.log(`${key}class : ${obj[key]}`);
  })
}

askScore(1);

rl.on("close", function() {
  process.exit();
})
