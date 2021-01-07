function solution(s) {
  if (s.length === 4 || s.length === 6) {
    return /[0-9]{4}|[0-9]{6}/.test(s);
  } else {
    return false;
  }
}
