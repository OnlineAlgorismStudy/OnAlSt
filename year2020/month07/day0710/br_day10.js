const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

const printResult = (scores, cnt) => {
  let final = 0;
  for (let i in scores) {
    final += scores[i];
  }

  console.log(`avg : ${(final/cnt).toFixed(1)}`);
  console.log(final >= 80*cnt ? 'pass' : 'fail');

  rl.close();
}

rl.on("line", function(cnt) {
  if(!isNaN(cnt) && cnt <= 10) {
    let scores = [];
    rl.on("line", function(score) {
      let tmp = score.split(' ');
      while (scores.length < cnt && null != tmp && tmp.length > 0) {
          if (isNaN(tmp[0])) tmp.shift();
          else scores.push(parseInt(tmp.shift()));
      }
      if (scores.length >= cnt) console.log(printResult(scores, cnt));
    });

  }
});

rl.on("close", function() {
  process.exit();
})
