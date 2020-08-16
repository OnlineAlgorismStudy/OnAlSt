n = int(input())
arr = []

while n != 0 and len(arr) < 100:
    if n % 2 == 1:
        arr.append(n * 2)
    else:
        arr.append(n // 2)
    n = int(input())
print(len(arr))
print(*arr)
