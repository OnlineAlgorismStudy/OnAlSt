def recursion(n):
    if n > 1:
        return n + recursion(n-1)
    else:
        return 1


n = int(input())
print(recursion(n))
