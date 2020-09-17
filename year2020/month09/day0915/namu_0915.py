def calculate(a, b):
    if a > 0 and b > 0:
        return max(a, b) ** 2 - min(a, b) ** 2


a, b = map(int, input().split())
print(calculate(a, b))
