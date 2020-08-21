#아대숲 찐구 0831 문제풀이

import numpy as np

tot_list = []

for i in range(0,3):
    alphabets = input().split(' ')
    tot_list.append(alphabets)


for i in range(0,3):
    for j in range(0,5):
        print(tot_list[i][j].lower(),end=" ")
        
    print()
   
