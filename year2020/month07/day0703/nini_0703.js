const readline = require('readline');
const r1 = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

r1.on('line', function(line) {
  let aLength = line.split(" "),
      iHori = Number(aLength[0]) + 5, // 가로
      iVerti = Number(aLength[1]) * 2; // 세로

  console.log("width = "+iHori);
  console.log("length = "+iVerti);
  console.log("area = "+iHori * iVerti);

  process.exit();
});