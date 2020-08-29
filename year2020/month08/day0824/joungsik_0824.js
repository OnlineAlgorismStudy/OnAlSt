const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});
const scores = [];

rl.on("line", (line) => {
  scores.push(line.split(" ").map((num) => parseInt(num)));
  if (scores.length == 5) {
    rl.close();
  }
});

rl.on("close", () => {
  const results = scores.map((score) =>
    score.reduce((result, cost) => (result += cost), 0) / score.length >= 80
      ? "pass"
      : "fail"
  );

  console.log(results.join("\n"));
  console.log(
    "Successful : " + results.filter((result) => result === "pass").length
  );
});
