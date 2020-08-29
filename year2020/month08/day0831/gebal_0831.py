cache = [input().split(' ') for x in range(3)]
[[print(c.lower(), end=' ') if i != 4 else print(c.lower()) for i, c in enumerate(x)] for x in cache]
