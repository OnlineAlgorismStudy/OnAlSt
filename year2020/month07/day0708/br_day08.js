const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

const getCapital = country => {
  if (country === 1) console.log('\nSeoul');
  else if (country === 2) console.log('\nWashington');
  else if (country === 3) console.log('\nTokyo');
  else if (country === 4) console.log('\nBeijing');
  else {
    console.log('\nnone');
    rl.close();
  }
  console.log();
  rl.prompt();
}
rl.setPrompt("1. Korea\n2. USA\n3. Japan\n4. China\nnumber? ");
rl.prompt();
rl.on("line", function(line) {
  let num = parseInt(line);
  if (!isNaN(num)) {
    getCapital(num);
  }
})

rl.on("close", function() {
  process.exit();
});
