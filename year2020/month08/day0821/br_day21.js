const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

let ary1 = [];
let ary2 = [];
let tmpary = [];
let cnt = 0;
rl.setPrompt('first array\n');
rl.prompt();
rl.on("line", function(line) {
  let tmp = line.split(' ');
  while(cnt < 16 && null != tmp && tmp.length > 0) {
    let cur = Number(tmp.shift());
    if (!isNaN(cur)) {
      tmpary.push(cur);
      cnt++;
      if (cnt%4 == 0) {
        if (cnt > 8) ary2.push(tmpary);
        else ary1.push(tmpary);
        tmpary = [];
      }
    }
    if (cnt == 8) {
      rl.setPrompt('second array\n');
      rl.prompt();
    }
  }

  if (null != ary2 && ary2.length == 2) {
    ary1.map(function(item, row){
      console.log((item.map(function(num, col){
        return num*ary2[row][col];
      })).join(' '));
    })
    rl.close();
  }
})

rl.on("close", function() {
  process.exit();
})
