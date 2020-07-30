s, e = [int(x) for x in input().split()]
while s < 2 or e < 2 or s > 9 or e > 9:
    print('Input Error!')
    s, e = [int(x) for x in input().split()]

rangeFlag = -1 if s >= e else 1


def make_string(num, i):
    return f"{num} * {i} = {num * i:>2}   "


# i = 1-10, j = s to e
for i in range(1, 10):
    line = ""
    for j in range(s, e + rangeFlag, rangeFlag):
        line += make_string(j, i)
    print(line)
