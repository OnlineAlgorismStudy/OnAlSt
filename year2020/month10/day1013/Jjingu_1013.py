#찐구 1013 문제풀이

import numpy as np

def reculsive(a):
    global cache, n
    
    if a == 1:
        cache[a-1]=1
    elif a == 2:
        cache[a-1]=2
    else:
        cache[a-1] = (cache[a-2]*cache[a-3])%100
    
    if a == n:
        print(cache[a-1])
    else:
        reculsive(a+1)
        
n = int(input())
cache = np.zeros(n,dtype=int)
reculsive(1)
