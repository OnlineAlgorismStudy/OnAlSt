# -*- coding: utf-8 -*-
"""
Created on Sun Aug 16 18:03:30 2020

@author: hanso
"""
#아대숲 찐구 0820 문제풀이

array = [[5,8,10,6,4],
         [11,20,1,13,2],
         [7,9,14,22,3]]

for i in range (0,3):
    for j in range(0,5):
        print(f"{array[i][j]}".rjust(5), end="")
    
    print("\n")