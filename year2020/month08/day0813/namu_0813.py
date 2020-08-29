n = int(input())
arr = []
while n != 999 and -1000 < n < 1000:
    arr.append(n)
    n = int(input())
print(f'max: {max(arr)}\nmin : {min(arr)}')
