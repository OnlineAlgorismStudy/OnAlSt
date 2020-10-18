def recur(n):
    if n == 0:
        return 0
    else:
        return (n%10)**2 + recur(n//10)

n = int(input())
print(recur(n))
