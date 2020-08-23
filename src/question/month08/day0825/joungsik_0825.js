// https://www.it-swarm.dev/ko/input/nodejs-stdin%EC%97%90%EC%84%9C-%ED%82%A4-%EC%9E%85%EB%A0%A5%EC%9D%84-%EC%9D%BD%EB%8A%94-%EB%B0%A9%EB%B2%95/971689865/
// 참고한 링크

let nums = [];
const stdin = process.stdin;

// 중요 stream 형태로 console 입력을 받는 부분
stdin.setRawMode(true);

// resume stdin in the parent process (node app won't quit all by itself
// unless an error or process.exit() happens)
stdin.resume();

// i don't want binary, do you?
stdin.setEncoding("utf8");

let lastKey = "";
let word = "";
// on any data into stdin
stdin.on("data", function (key) {
  if (lastKey === " " && key === "0") {
    // nums.push(word);
    console.log("");

    let index = 11;
    const result = nums.reduce((result, item) => {
      // (index * 10 ~ index * 10 + 10)
      index -= 1;
      const getTens = parseInt(parseInt(item) / 10);
      result[`${getTens * 10}`] =
        result[`${getTens * 10}`] === undefined
          ? 1
          : result[`${getTens * 10}`] + 1;
      return result;
    }, {});

    Object.keys(result)
      .sort((a, b) => b - a)
      .map((num) => console.log(`${num} : ${result[num]} person`));

    process.exit();
  }

  // 긴급 제동 장치
  // if (key === "\u0003") {
  //   process.exit();
  // }

  if (key !== " ") {
    word += key;
  } else {
    nums.push(word);
    word = "";
  }

  process.stdout.write(key);
  lastKey = key;
});
