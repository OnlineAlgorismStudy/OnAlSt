function solution(x) {
  var answer =
    x %
      String(x)
        .split("")
        .reduce((prev, value) => prev + parseInt(value), 0) ===
    0;
  return answer;
}
