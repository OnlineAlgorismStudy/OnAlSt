#아대숲 찐구 0824 문제풀이

import numpy as np

tot_list = []
ret = True
num_st = 0

while ret:
    scores = input().split(' ')
    if len(scores)==4:
        num_st += 1
        scores = list(map(int,scores))
        tot_list.append(scores)
    else:
        print("Please Check input")
        
    if num_st == 5:
        ret = False
        break

num_S = 0
for i in range(0,5):
    avg = np.mean(tot_list[i])
    if avg>=80:
        print("pass")
        num_S += 1
    else:
        print("fail")
        
print("Successful :",num_S)
    
