function solution(n) {
  const flag = "박수";
  var answer = "수" + flag.repeat((n - 1) / 2);
  if ((n - 1) % 2 !== 0) {
    answer += "박";
  }
  return answer;
}
