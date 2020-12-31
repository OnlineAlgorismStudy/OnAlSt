def solution(n):
    answer = []
    repeat = True
    while repeat:
        answer.append(n%10)
        n = n//10
        if n == 0:
            repeat = False
            
    return answer
