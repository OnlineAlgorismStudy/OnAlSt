def solution(a, b):
    answer = 0
    for i in range(abs(a-b)+1):
        answer+=min((a,b))+i
    return answer
