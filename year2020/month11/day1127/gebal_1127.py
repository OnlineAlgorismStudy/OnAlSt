def solution(numbers: list):
    numbers.sort()
    tmp = set()
    for i in range(len(numbers)):
        for j in range(i + 1, len(numbers)):
            tmp.add(numbers[i] + numbers[j])
    answer = list(tmp)
    answer.sort()
    return answer
