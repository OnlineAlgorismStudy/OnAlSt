const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

let letters = [];
rl.on("line", function(line) {
  line = line.replace(/ /g, "");
  let tmp = line.split('');
  while(letters.length < 10 && null != tmp && tmp.length > 0) {
    letters.push(tmp.shift());
  }
  if (letters.length == 10) {
    console.log(`${letters[0]} ${letters[3]} ${letters[6]}`);
    rl.close();
  }
})

rl.on("close", function() {
  process.exit();
})
