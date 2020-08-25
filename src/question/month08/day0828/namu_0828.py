import numpy as np
arr = []
for _ in range(4):
    arr.append([int(x) for x in input().split()])
arr = np.array(arr)

print(*np.floor(arr.mean(axis=1)).astype(int))
print(*np.floor(arr.mean(axis=0)).astype(int))
print(np.floor(arr.mean()).astype(int))
