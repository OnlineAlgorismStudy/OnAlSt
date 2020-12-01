def solution(n):
    cache = []
    while n >= 3:
        cache.append(n % 3)
        n = int(n / 3)
    cache.append(n)
    cache.reverse()
    return sum([(3 ** i) * x for i, x in enumerate(cache)])
