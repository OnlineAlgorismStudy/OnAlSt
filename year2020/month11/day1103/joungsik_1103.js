const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

rl.question("", (line) => {
  request(false, line);
});

const request = (flag, str) => {
  if (str.length === 1) {
    console.log(str);
    rl.close();
  } else {
    if (flag) {
      console.log(str);
    }
    rl.question("", (line) => {
      const index = parseInt(line);
      if (index > str.length) {
        request(true, str.slice(0, str.length - 1));
      } else {
        request(true, str.slice(0, index - 1) + str.slice(index, str.length));
      }
    });
  }
};
