// https://www.it-swarm.dev/ko/input/nodejs-stdin%EC%97%90%EC%84%9C-%ED%82%A4-%EC%9E%85%EB%A0%A5%EC%9D%84-%EC%9D%BD%EB%8A%94-%EB%B0%A9%EB%B2%95/971689865/
// 참고한 링크

let nums = Array(100);
const stdin = process.stdin;

// 중요 stream 형태로 console 입력을 받는 부분
stdin.setRawMode(true);

// resume stdin in the parent process (node app won't quit all by itself
// unless an error or process.exit() happens)
stdin.resume();

// i don't want binary, do you?
stdin.setEncoding("utf8");

let index = 0;

let moreLastKey = "";
let lastKey = "";
let word = "";
// on any data into stdin
stdin.on("data", function (key) {
  if (moreLastKey === "9" && lastKey === "9" && key === "9") {
    nums[index] = "";
    process.stdout.clearLine();
    process.stdout.cursorTo(0);
    console.log(nums.join(" "));

    console.log(
      `max : ${
        nums
          .filter((num) => !isNaN(parseInt(num)))
          .sort((num1, num2) => {
            return parseInt(num1) - parseInt(num2);
          })
          .splice(-1)[0]
      }`
    );
    console.log(
      `min : ${
        nums
          .filter((num) => !isNaN(parseInt(num)))
          .sort((num1, num2) => {
            return parseInt(num2) - parseInt(num1);
          })
          .splice(-1)[0]
      }`
    );

    process.exit();
  }

  // 긴급 제동 장치
  // if (key === "\u0003") {
  //   process.exit();
  // }

  if (key !== " ") {
    word += key;
  } else {
    nums[index] = word;
    index += 1;
    word = "";
  }

  process.stdout.write(key);
  if (lastKey === "9" && key === "9") {
    moreLastKey = lastKey;
  }
  lastKey = key;
});
