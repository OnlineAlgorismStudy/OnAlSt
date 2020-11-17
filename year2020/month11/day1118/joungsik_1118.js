const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

rl.on("line", function (line) {
  const strs = ["flower", "rose", "lily", "daffodil", "azalea"];
  const target = line;

  const result = strs.filter(
    (str) => str.charAt(1) === target || str.charAt(2) === target
  );

  result.map((r) => console.log(r));
  console.log(result.length);

  rl.close();
});
