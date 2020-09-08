const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

function isCapi(char) {
  return char.match(/[A-Z]/);
}

let letters = [];
let stop = false;
let cnt;
rl.on("line", function(line) {
  let tmp = line.replace(/ /g, '').split('');
  while(null != tmp && tmp.length > 0) {
    if (isCapi(tmp[0])) {
      letters.push(tmp[0]);
      tmp.shift();
    } else {
      stop = true;
      break;
    }
  }

  if (stop) {
    const letters_cnt = [];
    letters = letters.sort((x,y) => {return x>y ? 1 : -1;});
    while (null != letters && letters.length > 0) {
      let char = letters[0];
      let cnt = letters.lastIndexOf(char) - letters.indexOf(char) + 1;
      letters_cnt.push({key:char, count:cnt});
      letters.splice(0, cnt);
    }
    letters_cnt.forEach((item, i) => {
      const {key, count} = item;
      console.log(`${key} : ${count}`);
    });
    rl.close();
  }
})

rl.on("close", function() {
  process.exit();
})
