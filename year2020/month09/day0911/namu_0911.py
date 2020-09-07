n = int(input())


def get_sum(n):
    print(n * (n + 1) // 2)


if n < 1001:
    get_sum(n)
