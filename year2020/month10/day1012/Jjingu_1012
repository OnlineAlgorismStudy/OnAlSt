#찐구 1012 문제풀이

import numpy as np

def dice(level, recent_sum):
    global cache, m
    
    if level == len(cache):
        if recent_sum == m:
            print(*cache)
        
        return
    
    for i in range(1,7):
        cache[level] = i
        if (recent_sum+i)>m:
            break

        dice(level+1, recent_sum+i) 
                
                    
n, m = list(map(int,input().split(' ')))
cache = np.zeros(n,dtype=int)

dice(0, 0)
