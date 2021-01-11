def solution(s, st):
    cnt = 0
    for x in st:
        stack = list(s)
        stack.reverse()
        d = dict.fromkeys(s, stack.pop)
        for y in x:
            k = y
            tmp = d.get(k)
            if tmp and tmp() != k:
                cnt += 1
                break
    return len(st) - cnt
