def recursive(n):
    if n == 1:
        return 1
    return recursive(n // 2) + recursive(n - 1)

n = int(input())
print(recursive(n))
