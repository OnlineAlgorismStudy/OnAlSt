const readline = require('readline');
const r1 = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

function fnQestion() {
  r1.question(`
1. Korea
2. USA
3. Japan
4. China
number? `, (paramKey) => {
    let aData = [
      {key : "1", value : "Seoul"},
      {key : "2", value : "Washington"},
      {key : "3", value : "Tokyo"},
      {key : "4", value : "Beijing"}
    ];

    let bResult = aData.some(function(item, idx){
      if(item["key"] === paramKey) {
          console.log("\n"+item["value"]);
          return true; 
      }
      return false;
    });
    
    if(bResult){
      fnQestion();
    }else{
      console.log("\nnone");
      process.exit();
    }
  });
};

fnQestion();


