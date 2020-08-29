import numpy as np
arr = np.array([[3, 5, 9], [2, 11, 5], [8, 30, 10], [22, 5, 1]])
for item in arr:
    print(*item)
print(np.sum(arr))
