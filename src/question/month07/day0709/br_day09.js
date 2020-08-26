const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

const getResult = (num1, num2) => {
  let result = ((num1*num2)/2).toFixed(1);
  console.log(`Triangle width = ${result}`);

  rl.question("Continue? ", function(answer) {
    if (answer !== 'y' && answer !== 'Y') rl.close();
    else askQuestion();
  });
}

function askQuestion() {
  rl.question("Base = ", function(num1) {
    if (!isNaN(num1)) {
      rl.question("Height = ", function(num2) {
        if (!isNaN(num2)) getResult(num1, num2);
      })
    }
  });
}

askQuestion();

rl.on("close", function() {
  process.exit();
});
