n = list(map(int, input().split(' ')))
n.sort()

def proc(n):
    print(f"== {n}dan ==")
    [print(f"{n} * {i} = {n*i}") for i in range(1, 10)]

[proc(x) for x in range(n[0], n[1] + 1)]
