arr = []
for _ in range(3):
    arr.append(list(map(int, input().split())))


def calc_sum(arr):
    for list_ in arr:
        list_.append(sum(list_))
    arr.append(list(map(sum, zip(*arr))))


calc_sum(arr)
for l in arr:
    print(*l)
