def solution(x):
    return True if (x / sum(map(int, str(x)))).is_integer() else False
