arr = []
for _ in range(3):
    arr.append([x.lower() for x in input().split()])
for s in arr:
    print(*s)
