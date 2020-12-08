def solution(n):
    return sum([i if n % i == 0 else 0 for i in range(1, (n // 2) + 1)]) + n
