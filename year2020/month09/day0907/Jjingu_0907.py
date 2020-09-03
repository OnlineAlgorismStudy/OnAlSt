# 찐구 0907 문제풀이

def power_num(a, b):
    c = a**b
    return c

a, b = input().split()
a, b = int(a), int(b)
c = power_num(a, b)
print(c)
