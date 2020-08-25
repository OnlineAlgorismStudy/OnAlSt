#아대숲 찐구 0825 문제풀이

import collections
import numpy as np

ret = True
count = 0
num_list = []
while ret:
    a = int(input())
    if a == 0 or count ==100:
        ret = False
        break
    else:
        num_list.append(a)
        count +=1
        
num_arr = np.array(num_list)/10
num_arr = np.floor(num_arr)*10
num_arr = np.sort(num_arr)[::-1]

counter = collections.Counter(num_arr)
items = counter.items()

for k,v in items:
    print('%d'%k, ":",v,"person")
    
