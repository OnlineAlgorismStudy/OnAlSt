n = input().split(' ')
x, y = list(map(int, n))

def proc(a, b):
    print(a ** 2 - b ** 2) if a > b else print(b ** 2 - a ** 2)

proc(x, y)
