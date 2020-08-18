import numpy as np
first = np.array([[1, 2, 3, 4], [5, 6, 7, 8]])
second = np.array([[1, 4, 7, 8], [3, 6, 9, 8]])
[[print(v, end=' ') if i != 3 else print(v) for i, v in enumerate(x)] for x in first * second]
