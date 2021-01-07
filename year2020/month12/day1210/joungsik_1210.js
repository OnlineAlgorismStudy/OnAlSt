function solution(a, b) {
  var answer = a.reduce((prev, value, index) => prev + value * b[index], 0);
  return answer;
}
