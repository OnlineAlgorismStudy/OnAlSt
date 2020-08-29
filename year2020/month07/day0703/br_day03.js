const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});
const rect = [];
let tmp = [];
rl.on("line", function(line) {
  tmp = line.split(" ");

  while (tmp.length > 0) {
    if (isNaN(tmp[0])) tmp.shift();
    else rect.push(tmp.shift());
    if (rect.length >= 2) break;
  }

  if (rect.length >= 2) {
    let len1 = Number(rect[0])+5;
    let len2 = rect[1]*2;
    console.log('width =', len1);
    console.log('length =', len2);
    console.log('area =', len1*len2);
    rl.close();
  }
})

rl.on("close", function() {
  process.exit();
});
