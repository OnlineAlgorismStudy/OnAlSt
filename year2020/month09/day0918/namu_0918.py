a, b = map(int, input().split())
c, d = map(float, input().split())


def find_max(a, b):
    if isinstance(a, int):
        print(a if abs(a) > abs(b) else b)
    elif isinstance(a, float):
        print("{:.2f}".format(max(a, b)))


find_max(a, b)
find_max(c, d)
