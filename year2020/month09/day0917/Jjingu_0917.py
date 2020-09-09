#아대숲 찐구 0917 문제풀이

import numpy as np

def input_array(n):
    array = np.zeros(n,dtype=np.int64())
    for i in range(0,n):
        array[i] = int(input())
        
    array = np.sort(array)[::-1]
               
    return array

n = int(input())
array = input_array(n)
print(*array)
