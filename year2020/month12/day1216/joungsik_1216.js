function solution(n) {
  var answer = String(n)
    .split("")
    .reverse()
    .map((n) => parseInt(n));
  return answer;
}
