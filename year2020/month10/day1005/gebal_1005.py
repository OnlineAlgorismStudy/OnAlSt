def recursive(n):
    if n == 1:
        return 1
    return n + recursive(n - 1)

n = int(input())
print(recursive(n))
