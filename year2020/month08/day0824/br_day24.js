const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

let aryresult = [];
let tmpary = [];
let cnt = 0;

rl.on("line", function(line) {
  let tmp = line.split(' ');
  while(aryresult.length < 5 && null != tmp && tmp.length > 0) {
    let cur = Number(tmp.shift());
    if (!isNaN(cur)) {
      tmpary.push(cur);
    }
    if (tmpary.length == 4) {
      let total = 0;
      tmpary.forEach(function(n) {
        total += n;
      })

      if (total <80*4) aryresult.push("fail");
      else {
        aryresult.push("success");
        cnt++;
      }

      tmpary = [];
    }
  }

  if (aryresult.length == 5) {
    console.log(aryresult.join('\n'));
    console.log(cnt);
    rl.close();
  }
})

rl.on("close", function() {
  process.exit();
})
