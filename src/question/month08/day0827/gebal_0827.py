import numpy as np
cache = np.array([[3, 5, 9], [2, 11, 5], [8, 30, 10], [22, 5, 1]])
[[print(v, end=' ') if i != 2 else print(v) for i, v in enumerate(x)] for x in cache]
print(cache.sum())
