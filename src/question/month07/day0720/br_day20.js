const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

let alphabet = ['A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L'
                , 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'];
const printAlphabet = cnt => {
  let rtnStr = alphabet.splice(0, cnt).join('');
  alphabet = alphabet.concat(rtnStr.split(''));
  return rtnStr;
}

rl.on("line", function(line) {
  line = parseInt(line);
  if (!isNaN(line) && line >=3 && line <= 10) {
    for (let i = 0; i < line; i++) console.log(printAlphabet(line-i));
    rl.close();
  }
})
