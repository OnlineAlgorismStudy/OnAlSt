function solution(s) {
  var answer = s.split(" ").map((a) =>
    a
      .split("")
      .map((n, index) => (index % 2 === 0 ? n.toUpperCase() : n.toLowerCase()))
      .join("")
  );
  answer = answer.join(" ");
  return answer;
}
