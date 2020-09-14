def buble_sort(cache):
    for i in range(10):
        for j in range(9):
            if cache[j] < cache[j + 1]:
                cache[j + 1], cache[j] = cache[j], cache[j + 1]
        print(*cache)


cache = list(map(int, input().split(' ')))
buble_sort(cache)
