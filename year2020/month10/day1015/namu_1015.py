def recur(n):
    if len(str(n)) == 1:
        return 1
    else:
        return int(str(n)[:1]) * recur(int(str(n)[1:]))


a, b, c = map(int, input().split())
print(recur(a * b * c))
