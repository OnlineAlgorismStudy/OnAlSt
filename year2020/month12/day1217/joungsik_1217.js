function solution(n) {
  var answer = Number.isInteger(Math.sqrt(n))
    ? Math.pow(parseInt(Math.sqrt(n)) + 1, 2)
    : -1;
  return answer;
}
