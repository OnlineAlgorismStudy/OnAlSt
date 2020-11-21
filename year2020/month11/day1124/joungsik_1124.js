const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

let str1, str2, num;

rl.on("line", function (line) {
  line.split(" ").map((value, index) => {
    switch (index) {
      case 0:
        str1 = value;
        break;
      case 1:
        str2 = value;
        break;
      case 2:
        num = parseInt(value);
        break;
    }
  });
  console.log(str1 + str2);
  console.log(str1.substr(0, num) + str2.substr(num, str2.length));
  rl.close();
});
