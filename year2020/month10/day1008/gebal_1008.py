def recursive(n):
    if n > 1:
        recursive(n // 2)
    print(n, end=' ')


n = int(input())
recursive(n)
