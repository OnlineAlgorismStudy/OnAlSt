def square():
    n = int(input())
    [print(x, end=' ') if x % n != 0 else print(x) for x in range(1, n * n + 1)]


square()
