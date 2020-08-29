const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

const isNumber = (value) => typeof value === "number" && isFinite(value);

const animal = [
  {
    id: 1,
    name_ko: "개",
    name_en: "dog",
  },
  {
    id: 2,
    name_ko: "고양이",
    name_en: "cat",
  },
  {
    id: 3,
    name_ko: "병아리",
    name_en: "chick",
  },
];

rl.question("Number? ", (value) => {
  try {
    const number = parseInt(value);
    const found = animal.find((item) => item.id === number);
    console.log(found ? found.name_en : "I don't know.");
  } catch (e) {
    console.log("숫자만 입력!");
  }
  rl.close();
});
