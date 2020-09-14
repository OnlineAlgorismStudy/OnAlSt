from math import sqrt
a, b = list(map(lambda x: sqrt(float(x)), input().split(' ')))
print(abs(int(a - b)))
