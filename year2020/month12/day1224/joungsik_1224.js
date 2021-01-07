function solution(phone_number) {
  var answer = phone_number
    .split("")
    .map((pn, index) => (index < phone_number.length - 4 ? "*" : pn))
    .join("");
  return answer;
}
