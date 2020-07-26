n = int(input())
list_int = \
    [str(x) + ' ' if x < 10 else str(x) for x in range(1, n * (n + 1) // 2 + 1)]


k = n * 3 - 1
p = 0
for i in range(n):
    if n < 5:
        print((''.join(list_int[p:p + n - i])).rjust(k - 2))
    else:
        print((' '.join(list_int[p:p + n - i])).rjust(k))
    p += n - i


