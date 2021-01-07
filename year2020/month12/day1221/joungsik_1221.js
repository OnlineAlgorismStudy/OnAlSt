function solution(num) {
  var result = num;
  var answer = 0;
  while (result !== 1) {
    result = result % 2 === 0 ? parseInt(result / 2) : result * 3 + 1;
    answer += 1;
  }
  return answer > 500 ? -1 : answer;
}
