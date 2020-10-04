def sort(l):
    for _ in range(3):
        for i in range(len(l) - 1):
            if l[i] > l[i + 1]:
                l[i], l[i + 1] = l[i + 1], l[i]


l = [int(x) for x in input().split()]
sort(l)
print(*l)
