import numpy as np
cache = np.array([input(f'{x+1}class? ').split(' ') for x in range(4)], np.int32)
[print(f"{i+1}class : ", np.array(v).sum()) for i, v in enumerate(cache)]
