n = int(input())

max_ = 2 * n - 1
for i in range(n):
    print(('*' * (2 * i + 1)).rjust(max_))
