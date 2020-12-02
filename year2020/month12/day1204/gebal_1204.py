def solution(s):
    return str.join('', sorted(list(s), reverse=True))
