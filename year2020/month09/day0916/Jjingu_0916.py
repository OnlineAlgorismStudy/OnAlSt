#아대숲 찐구 0916 문제풀이

import numpy as np

def input_array():
    n = np.zeros((3,3),dtype=np.float64)
    for i in range(0,3):
        a = np.array(input().split(" "),dtype=np.float64)
        n[i,:] = a
        
    return n

def calculate_avg(n):
    array_avg = np.zeros((4,4), dtype=np.float64)
    for i in range(0,3):
        array_avg[i,:-1] = n[i,:]
        array_avg[i,-1] = np.sum(n[i,:])
    
    for i in range(0,4):
        array_avg[-1,i] = np.sum(array_avg[:,i])
        
    return array_avg

def print_array(n):
    array_avg = calculate_avg(n)
    for i in range(0,4):
        for j in range(0,4):
            print(int(array_avg[i,j]),end =' ')
        print()
    
n = input_array()
print_array(n)
