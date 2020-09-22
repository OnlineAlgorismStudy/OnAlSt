#찐구 0924 문제풀이

import numpy as np

def function_0924(array):
    print(np.sum(np.absolute(array)))
    
mylist = list(map(int ,input().split(" ")))
array = np.array(mylist)

function_0924(array)
