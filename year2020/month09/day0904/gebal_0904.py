def _max():
    n = list(map(int, input().split(' ')))
    n.sort(reverse=True)
    print(n[0])

_max()
