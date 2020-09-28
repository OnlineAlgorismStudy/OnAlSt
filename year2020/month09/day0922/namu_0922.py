def calc(a, b):
    print(f"({a} - {b}) ^ 2 = {(a - b) ** 2}")
    print(f"({a} + {b}) ^ 3 = {(a + b) ** 3}")


a, b = map(int, input().split(' '))
calc(a,b)
