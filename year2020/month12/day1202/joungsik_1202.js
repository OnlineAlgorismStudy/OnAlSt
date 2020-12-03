function solution(s) {
  const index = parseInt(s.length / 2);
  return s.length % 2 === 0 ? s.substr(index - 1, 2) : s.substr(index, 1);
}
