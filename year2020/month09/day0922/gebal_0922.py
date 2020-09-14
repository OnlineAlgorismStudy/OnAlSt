add = lambda x, y: (x + y) ** 3
sub = lambda x, y: (x - y) ** 2

a, b = list(map(int, input().split(' ')))
print(f"({a} - {b}) ^ 2 = {sub(a, b)}")
print(f"({a} + {b}) ^ 3 = {add(a, b)}")
