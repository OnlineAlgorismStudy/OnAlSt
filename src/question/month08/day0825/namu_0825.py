n = int(input())
d = {}
while n != 0 and len(d) < 100:
    if n // 10 not in d:
        d[n // 10] = 1
    else:
        d[n // 10] += 1
    n = int(input())
for key in (sorted(d.keys(), reverse=True)):
    print(f'{key * 10} : {d[key]} person' )
