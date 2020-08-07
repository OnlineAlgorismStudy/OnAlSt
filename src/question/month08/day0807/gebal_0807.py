inp = input().split(' ')
under = 100
upper = 10001


def find_min(x):
    global under, upper
    n = int(x)
    if n < 100 and n < under:
        under = n
    elif 100 <= n < upper:
        upper = n


[find_min(x) for x in inp]
print(under, 100 if upper == 10001 else upper)
