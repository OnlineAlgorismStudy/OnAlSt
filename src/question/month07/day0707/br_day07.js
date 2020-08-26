const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

const getAnimals = number => {
  if (number === 1) return 'dog';
  else if (number === 2) return 'cat';
  else if (number === 3) return 'chick';
  else return "I don't know";
}

rl.on("line", function(line) {
  let num = parseInt(line);
  if (!isNaN(num)) {
    console.log(getAnimals(num));
    rl.close();
  }
})

rl.on("close", function() {
  process.exit();
});
