const readline = require('readline');
const r1 = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

r1.question('Number? ', (line) => {
  let oAnimal = [
    {key : "1", value : "dog"},
    {key : "2", value : "cat"},
    {key : "3", value : "chick"}
  ];

  let bResult = oAnimal.some(function(item, idx){
    if(item["key"] === line) {
        console.log(item["value"]);
        return true; 
    }
    return false;
  });

  if(!bResult) {
    console.log("I don`t know.");
  }  
  process.exit();

});