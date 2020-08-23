const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

let result = [];

rl.on("line", (line) => {
  result.push(line.split(" "));
  if (result.length === 4) {
    rl.close();
  }
});

rl.on("close", () => {
  console.log(
    result
      .map((array) =>
        parseInt(
          array.reduce((prev, value) => {
            return (prev += parseInt(value));
          }, 0) / array.length
        )
      )
      .join(" ")
  );

  const result2 = result.reduce((prev, value) => {
    prev["0"] =
      prev["0"] === undefined
        ? parseInt(value[0])
        : prev["0"] + parseInt(value[0]);
    prev["1"] =
      prev["1"] === undefined
        ? parseInt(value[1])
        : prev["1"] + parseInt(value[1]);
    return prev;
  }, {});
  console.log(
    Object.keys(result2)
      .map((value) => parseInt(result2[value] / 4))
      .join(" ")
  );

  let index = 0;
  const total = result.reduce(
    (prev, value) =>
      (prev += value.reduce((valuePrev, num) => {
        index += 1;
        return (valuePrev += parseInt(num));
      }, 0)),
    0
  );
  console.log(parseInt(total / index));
});
