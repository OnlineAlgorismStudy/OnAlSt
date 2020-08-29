import numpy as np
cache = np.array([input().split(' ') for x in range(4)], np.int32)
h = np.transpose(cache)
[print(int(np.array(x).mean()), end=' ') for x in cache]
print()
[print(int(np.array(y).mean()), end=' ') for y in h]
print(f'\n{int(cache.mean())}')
