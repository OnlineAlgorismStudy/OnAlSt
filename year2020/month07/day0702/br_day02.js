const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

rl.setPrompt('yard? ');
rl.prompt();
rl.on("line", function(yd) {
  if (isNaN(yd)) {
    console.log('입력 형식이 올바르지 않습니다.');
    rl.prompt();
  } else {
    console.log(yd + 'yard = ' + (yd*91.44).toFixed(1) + 'cm');
    rl.close();
  }
})

rl.on("close", function() {
  process.exit();
});
