def recursive(n):
    if n == 0:
        return
    print(n, end=' ')
    recursive(n - 1)

n = int(input())
recursive(n)
