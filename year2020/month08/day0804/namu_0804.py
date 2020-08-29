arr = []
n = int(input())
while n != 0 and len(arr) < 99:
    arr.append(n)
    n = int(input())
print(*arr[::-1])
