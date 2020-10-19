const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

const translate = (num) => String.fromCharCode(num);

const request = () => {
  rl.question("ASCII code =? ", (answer) => {
    const num = parseInt(answer);
    if (num !== NaN && num >= 33 && num <= 127) {
      console.log(translate(num));
      request();
    } else {
      rl.close();
    }
  });
};

request();
