def recursive(n):
    if n == 0:
        return
    else:
        print(n, end=' ')
        recursive(n - 1)


n = int(input())
if n < 51:
    recursive(5)
