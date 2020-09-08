const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

let scores = [];
let cnt;
rl.on("line", function(line) {
  let tmp = line.split(' ');
  while(isNaN(cnt) && null != tmp && tmp.length > 0) {
    let cur = Number(tmp[0]);
    if (!isNaN(cur)) {
      cnt = cur;
      break;
    }
    tmp.shift();
  }

  if (!isNaN(cnt) && cnt > 0) {
    rl.on("line", function(line) {
      let tmp = line.split(' ');
      while (scores.length < cnt && null != tmp && tmp.length > 0) {
        let cur = Number(tmp[0]);
        if (!isNaN(cur)) {
          scores.push(cur);
        }
        tmp.shift();
      }
      if (scores.length == cnt) {
        console.log(scores.sort((a, b) => {return b-a;}).join('\n'));
        rl.close();
      }
    })
  }
})

rl.on("close", function() {
  process.exit();
})
