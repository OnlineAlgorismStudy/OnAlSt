function solution(a, b) {
  var answer = 0;
  const start = a < b ? a : b;
  const end = start == a ? b : a;
  for (let i = start; i <= end; i++) {
    answer += i;
  }
  return answer;
}
