#찐구 0918 문제풀이

import numpy as np

def int_compare(array_int):
    array_abs = np.abs(array_int)
    output = array_int[np.where(array_abs==np.max(array_abs))]
    print(output[0])
    
def real_compare(array_real):
    array_abs = np.abs(array_real)
    output = array_real[np.where(array_abs==np.min(array_abs))]
    print(round(output[0],2))
        
array_int = np.array(input().split(" "),dtype=int)
array_real = np.array(input().split(" "),dtype=float)

int_compare(array_int)
real_compare(array_real)
