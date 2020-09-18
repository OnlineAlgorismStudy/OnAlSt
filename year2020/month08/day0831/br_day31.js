const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

let aryresult = [];
let tmpary = [];

function isCap(chr) {
  return ("ABCDEFGHIJKLMNOPQRSTUVWXYZ".indexOf(chr) > -1);
}

rl.on("line", function(line) {
  let tmp = (line.replace(/ /g, "")).split('');
  while(aryresult.length < 3 && null != tmp && tmp.length > 0) {
    let cur = tmp.shift();
    if (isCap(cur)) {
      tmpary.push(cur);
    }
    if (tmpary.length == 5) {
      aryresult.push(tmpary);
      tmpary = [];
    }
  }

  if (aryresult.length == 3) {
    aryresult.forEach((ary, i) => {
      console.log((ary.map((chr) => chr.toLowerCase())).join(" "));
    });
    rl.close();
  }
});

rl.on("close", function() {
  process.exit();
});
