const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

const request = () => {
  rl.once("line", (line) => {
    const [s, e] = line.split(" ");
    if (s < 2 || s > 9 || e < 2 || e > 9 || s === undefined || e == undefined) {
      console.log("INPUT ERROR!");
      request();
    } else {
      [...Array(9).keys()].forEach((x, index, array) => {
        const result = [...Array(Math.abs(s - e) + 1).keys()]
          .map((num, i) => {
            const key = s - e >= 0 ? parseInt(s) - i : parseInt(s) + i;
            return `${key} * ${index + 1} = ${
              String(key * (index + 1)).length == 2
                ? key * (index + 1)
                : " " + key * (index + 1)
            }`;
          })
          .join("   ");
        console.log(result);
      });
      rl.close();
    }
  });
};

request();
