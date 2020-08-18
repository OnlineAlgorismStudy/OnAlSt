cache = []
n = int(input())
[cache.append(int(input())) for i in range(n)]
[print(x) for x in sorted(cache, reverse=True)]
