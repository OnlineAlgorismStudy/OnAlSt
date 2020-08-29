const readline = require('readline');
const r1 = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

r1.on('line', function(line) {
  // 400으로 나누어떨어지거나, 4로 나누어 떨어지고 100 으로 나누어 떨어지지 않으면 윤년(leap year),
  // 나머지는 평년(common year)이다.
  let iYear = Number(line);

  if(iYear%400 === 0 || (iYear%4 === 0 && iYear%100 !== 0)) {
    console.log("leap year");
  }else{
    console.log("common year");
  }

  process.exit();
});