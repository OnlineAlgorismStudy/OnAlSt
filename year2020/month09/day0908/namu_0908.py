l = list(map(int, input().split()))


def calc(l):
    if l[0] > l[1]:
        l[0] //= 2
        l[1] *= 2
    else:
        l[0] *= 2
        l[1] //= 2


calc(l)
print(*l)
