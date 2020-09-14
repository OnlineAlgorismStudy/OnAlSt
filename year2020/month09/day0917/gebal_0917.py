def rsort(arr: list):
    arr.sort(reverse=True)
    print(*arr)

n = int(input())
cache = list(map(int, input().split(' ')))
rsort(cache)
