function solution(n) {
  var answer = String(n)
    .split("")
    .reduce((prev, value) => prev + parseInt(value), 0);
  return answer;
}
