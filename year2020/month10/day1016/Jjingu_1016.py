#찐구 1016 문제풀이

import numpy as np

def dice(level):
    global cache
    
    if level == len(cache):
        print(*cache)
        return
    
    elif level == 0:
        for i in range(1,7):
            cache[0] = i
            dice(level+1) 
        
    else:
        for i in range(cache[level-1],7):
            cache[level] = i
            dice(level+1) 
                
                    
n = int(input())
cache = np.zeros(n,dtype=int)

dice(0)
