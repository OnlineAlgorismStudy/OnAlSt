const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

const get = (num, index) => {
  if (num % index === num) {
    return parseInt(parseInt(num % index) / (index / 10)) === 0
      ? 1
      : parseInt(parseInt(num % index) / (index / 10));
  } else {
    const result =
      parseInt(parseInt(num % index) / (index / 10)) === 0
        ? 1
        : parseInt(parseInt(num % index) / (index / 10));
    return get(num, index * 10) * result;
  }
};

rl.on("line", function (line) {
  const [num1, num2, num3] = line.split(" ").map((l) => parseInt(l));
  console.log(get(num1 * num2 * num3, 1));
  rl.close();
});
