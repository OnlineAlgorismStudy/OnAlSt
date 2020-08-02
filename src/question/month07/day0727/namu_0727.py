n = int(input())
k = 2 * n - 1 if n < 10 else 17 + 3 * (n - 9)
for i in range(1, n + 1):
    print((' '.join(map(str, range(1, i + 1)))).rjust(k))
