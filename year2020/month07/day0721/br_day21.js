const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

let alphabet = ['A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L'
                , 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'];
let number = ['1', '2', '3', '4', '5', '6', '7', '8', '9', '0'];
const printStr = (type, cnt) => {
  let rtnStr = "";
  if (type === 'alphabet') {
    rtnStr = alphabet.splice(0, cnt).join('');
    alphabet = alphabet.concat(rtnStr.split(''));
  } else if (type === 'number') {
    rtnStr = number.splice(0, cnt).join('');
    number = number.concat(rtnStr.split(''));
  }
  return rtnStr;
}

rl.on("line", function(line) {
  line = parseInt(line);
  if (!isNaN(line) && line >=3 && line <= 10) {
    for (let i = 0; i < line; i++) console.log(printStr('number', line-i) + printStr('alphabet', i+1));
    rl.close();
  }
})

rl.on("close", function() {
  process.exit();
})
