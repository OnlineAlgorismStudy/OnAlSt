const readline = require('readline');
const r1 = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

function onWidth() {
  let iBase = 0,
      iHeight = 0;
  r1.question("Base = ",(result) => {
    iBase = Number(result);
    r1.question("Height = ",(result) => {
      iHeight = Number(result);

      console.log("Triangle width = " + ((iBase*iHeight)/2).toFixed(1));
      
      r1.question("Continue? ",(result) => {
        if(result.toUpperCase() === "Y") {
          onWidth();
        }else{
          process.exit();
        }
      });
    });
  });
};

onWidth();