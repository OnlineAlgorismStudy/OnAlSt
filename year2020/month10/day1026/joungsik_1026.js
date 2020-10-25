const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

const regex = /^[\x41-\x5A]|^[\x61-\x7A]*$/;

const request = () => {
  rl.on("line", function (line) {
    const char = regex.test(line) || parseInt(line);
    if (char) {
      console.log(Number.isInteger(char) ? String.fromCharCode(char) : line);
    } else {
      rl.close();
    }
  });
};

request();
