#아대숲 찐구 0827 문제풀이

import numpy as np
array = [[3,5,9],[2,11,5],[8,30,10],[22,5,1]]

for i in range (0,4):
    print(array[i][0],array[i][1],array[i][2])
    
arr = np.array(array)
print(np.sum(arr))
