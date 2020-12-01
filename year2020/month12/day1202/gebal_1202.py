def solution(s):
    length = int(len(s) / 2)
    return s[length-1:length+1] if len(s) % 2 == 0 else s[length]
