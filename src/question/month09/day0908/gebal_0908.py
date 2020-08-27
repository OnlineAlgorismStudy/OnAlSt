n = list(map(int, input().split(' ')))

def proc(n):
    if n[0] > n[1]:
        n[0] /= 2
        n[1] *= 2
    else:
        n[0] *= 2
        n[1] /= 2

proc(n)
print(int(n[0]), int(n[1]))
