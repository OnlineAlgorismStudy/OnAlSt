const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});
rl.on("line", function(line) {
  let year = parseInt(line);
  if (!isNaN(year)) {
    if (year % 400 === 0 || (year % 4 === 0 && year % 100 !== 0)) {
      console.log("leap year");
    } else {
      console.log("common year");
    }
    rl.close();
  }
})

rl.on("close", function() {
  process.exit();
});
