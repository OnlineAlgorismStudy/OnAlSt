def recursive(n):
    if n > 2:
        recursive(n - 2)
    print(n, end=' ')


n = int(input())
recursive(n)
