n = int(input())
j = 0
for _ in range(n):
    for _ in range(n):
        print((2 * j + 1) % 10, end=' ')
        j += 1
    print()
