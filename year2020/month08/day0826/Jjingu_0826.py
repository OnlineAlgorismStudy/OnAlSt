#아대숲 찐구 0826 문제풀이

import numpy as np

tot_list = []

for i in range(0,4):
    scores = input(f"{i+1}class?").split(' ')
    scores = list(map(int,scores))
    tot_list.append(scores)
        
for i in range(0,4):
   tot_score = np.sum(tot_list[i])
   print(f"{i+1}class :",tot_score)
    
