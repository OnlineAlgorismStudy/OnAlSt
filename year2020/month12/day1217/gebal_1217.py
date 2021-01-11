import math

def solution(n):
    x = math.sqrt(n)
    return math.pow((x + 1), 2) if x.is_integer() else -1
