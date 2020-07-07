const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

const countries = [
  {
    id: 1,
    name: "Korea",
    city: "Seoul",
  },
  {
    id: 2,
    name: "USA",
    city: "Washington",
  },
  {
    id: 3,
    name: "Japen",
    city: "Tokyo",
  },
  {
    id: 4,
    name: "China",
    city: "Beijing",
  },
];

const requestQuestion = () => {
  rl.question("number? ", (value) => {
    const number = parseInt(value);
    const found = countries.find((item) => item.id === number);
    if (found) {
      console.log(found.city);
      requestQuestion();
    } else {
      console.log("none");
      rl.close();
    }
  });
};

requestQuestion();
