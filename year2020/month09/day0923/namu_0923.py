from math import sqrt

a, b = map(float, input().split())


def calc(a, b):
    print(abs(int(sqrt(a) - sqrt(b))))

calc(a,b)
