function solution(n) {
  const list = Array(n)
    .fill()
    .map((_, index) => (n % (index + 1) === 0 ? index + 1 : null))
    .filter((f) => f !== null);
  var answer = list.reduce((prev, value) => prev + value, 0);
  return answer;
}
