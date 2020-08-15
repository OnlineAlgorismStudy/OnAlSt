const readline = require('readline');
const r1 = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});


r1.on("line",(result) => {
  let iNum = Number(result),
      iSum = 0;
  r1.on("line",(result) => {
    let aSubject = result.split(" "),
        iAvg = 0;

    aSubject.forEach(function(item, idx) {
      iSum += Number(item);
    });

    iAvg = (iSum/iNum).toFixed(1);
    console.log("avg : " + iAvg);

    if(iAvg >= 80) {
      console.log("pass");
    }else{
      console.log("fail");
    }
    process.exit();
  });
});