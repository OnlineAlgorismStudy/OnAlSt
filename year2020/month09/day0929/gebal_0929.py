cache = list(map(int, input().split(' ')))

for i in range(3):
    for index, j in enumerate(cache[:-1]):
        if cache[index] > cache[index + 1]:
            cache[index], cache[index + 1] = cache[index + 1], cache[index]

print(*cache)
