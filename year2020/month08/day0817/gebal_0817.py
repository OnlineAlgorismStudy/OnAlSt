cache = []
while True:
    n = int(input())
    if n == 0:
        print(len(cache))
        [print(int(x/2), end=' ') if x % 2 == 0 else print(x*2, end=' ') for x in cache]
        break
    cache.append(n)
