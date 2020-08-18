import numpy as np
inp = np.array([input().split(' ') for x in range(5)], np.int32)
std = np.array([x.mean() for x in inp])
[print("success") if v >= 80 else print("fail") for v in std]
print("Successful : ", np.count_nonzero(std >= 80))
