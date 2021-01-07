function solution(arr) {
  var answer = arr.reduce((prev, value) => prev + value, 0) / arr.length;
  return answer;
}
