import numpy as np
first = []
second = []
print("first array")
[first.append(input().split(' ')) for x in range(2)]
print("second array")
[second.append(input().split(' ')) for i in range(2)]
first = np.array(first, np.int32)
second = np.array(second, np.int32)
[[print(v, end=' ') if i != 3 else print(v) for i, v in enumerate(x)] for x in first * second]
