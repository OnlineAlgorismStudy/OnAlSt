// https://www.it-swarm.dev/ko/input/nodejs-stdin%EC%97%90%EC%84%9C-%ED%82%A4-%EC%9E%85%EB%A0%A5%EC%9D%84-%EC%9D%BD%EB%8A%94-%EB%B0%A9%EB%B2%95/971689865/
// 참고한 링크

let words = [];
const stdin = process.stdin;

// 중요 stream 형태로 console 입력을 받는 부분
stdin.setRawMode(true);

// resume stdin in the parent process (node app won't quit all by itself
// unless an error or process.exit() happens)
stdin.resume();

// i don't want binary, do you?
stdin.setEncoding("utf8");

// on any data into stdin
stdin.on("data", function (key) {
  if (key !== " " && !key.match("[A-Z]")) {
    console.log("");
    console.log(words);

    let group = words.reduce((result, word) => {
      if (result[word] === undefined) {
        result[word] = 1;
      } else {
        result[word] = result[word] + 1;
      }
      return result;
    }, {});

    group = Object.keys(group).map((key) => [key, group[key]]);
    group.sort((a, b) => (a[0] < b[0] ? -1 : a[0] > b[0] ? 1 : 0)).map((a) => console.log(`${a[0]} : ${a[1]}`));

    process.exit();
  }

  // 긴급 제동 장치
  // if (key === "\u0003") {
  //   process.exit();
  // }

  if (key !== " ") {
    words.push(key);
  }

  process.stdout.write(key);
});
