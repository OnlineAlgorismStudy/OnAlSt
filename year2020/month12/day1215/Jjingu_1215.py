def solution(n):
    answer = 0
    repeat = True
    while repeat:
        answer += n%10
        n = n//10
        if n == 0:
            repeat = False

    return answer
