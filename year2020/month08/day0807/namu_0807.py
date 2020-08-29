arr1, arr2 = [], []
for _ in range(10):
    n = int(input())
    if 0 < n < 100:
        arr1.append(n)
    elif 99 < n < 10000:
        arr2.append(n)
print(max(arr1) if arr1 else 100, min(arr2) if arr2 else 100)
