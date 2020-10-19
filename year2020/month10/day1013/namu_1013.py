def recur(n):
    if n < 3:
        return n
    else:
        return (recur(n - 1) * recur(n - 2)) % 100


n = int(input())
print(recur(n))
