def solution(a, b):
    return sum([x * b[i] for i, x in enumerate(a)])
