def recur(n):
    if len(str(n)) == 1:
        return 1
    else:
        return int(str(n)[:1]) * recur(int(str(n)[1:]))


n = int(input())
print(recur(n))
