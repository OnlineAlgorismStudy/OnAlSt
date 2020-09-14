def recursive(n):
    if n == 0:
        return 0
    return int(pow((n % 10), 2)) + recursive(int(n / 10))


n = int(input())
print(recursive(n))
