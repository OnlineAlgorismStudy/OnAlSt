def recur(n):
    if n >= 3:
        recur(n - 2)
    print(n)


n = int(input())
recur(n)
