const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

const getCapital = country => {
  if (country === 1) console.log('Seoul');
  else if (country === 2) console.log('Washington');
  else if (country === 3) console.log('Tokyo');
  else if (country === 4) console.log('Beijing');
  else {
    console.log('none');
    rl.close();
  }
}

rl.on("line", function(line) {
  let num = parseInt(line);
  if (!isNaN(num)) {
    getCapital(num);
  }
})

rl.on("close", function() {
  process.exit();
});
