def seq(n):
    if n >= 2:
        return seq(n//2) + seq(n-1)
    else:
        return 1


n = int(input())
print(seq(n))
