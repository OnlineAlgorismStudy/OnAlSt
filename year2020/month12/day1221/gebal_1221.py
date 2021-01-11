def solution(n):
    cnt = 0
    while n != 1 and cnt < 500:
        n = n / 2 if n % 2 == 0 else n * 3 + 1
        cnt += 1
    return cnt if cnt < 500 else -1
