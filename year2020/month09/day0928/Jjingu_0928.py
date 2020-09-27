# 찐구 0928 문제풀이
import numpy as np

def function_0928(array):
    print(round(np.average(array),0))
    array = np.round(array)
    sum = np.sum(array)
    print(np.round(np.average(array),0))
    
mylist = list(map(float ,input().split(" ")))
array = np.array(mylist)

function_0928(array)
