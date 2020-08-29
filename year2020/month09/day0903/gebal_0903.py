n = int(input())

def square(n):
    [print(x, end=' ') if x % 4 != 0 else print(x) for x in range(1, n * n + 1)]

square(n)
