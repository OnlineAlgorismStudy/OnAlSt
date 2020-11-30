function solution(numbers) {
  var answer = [];
  for (let index1 in numbers) {
    for (let index2 in numbers) {
      if (index1 === index2) {
        continue;
      } else {
        answer.push(numbers[index1] + numbers[index2]);
      }
    }
  }
  answer = Array.from(new Set(answer));
  answer = answer.sort((a, b) => a - b);
  return answer;
}
