n = int(input())


def sort_list(n):
    l = list(map(int, input().split()))[:n]
    print(*sorted(l, reverse=True))


sort_list(n)
