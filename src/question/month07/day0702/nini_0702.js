const readline = require('readline');
const r1 = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

r1.question('yard? ', (answer) => {
    let result = (91.44 * Number(answer)).toFixed(1);

  console.log(answer+"yard = "+result+"cm");

  process.exit();
});