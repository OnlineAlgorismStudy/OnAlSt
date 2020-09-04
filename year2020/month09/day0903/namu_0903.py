def print_in_square(num):
    for i in range(1, num ** 2 + 1):
        print(i, end=' ')
        if i % num == 0:
            print()


n = int(input())
print_in_square(n)
