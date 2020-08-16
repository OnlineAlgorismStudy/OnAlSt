# -*- coding: utf-8 -*-
"""
Created on Sun Aug 16 17:54:13 2020

@author: hanso
"""



#아대숲 찐구 0818 문제풀이

import numpy as np

ret = True
while ret:
    n = int(input())
    if n <= 20:
        break 
    else: 
        print("Enter the number under 20")

num_list = []
for i in range(0,n):
    a = int(input("Score: "))
    num_list.append(a)

num_arr = np.array(num_list)
num_arr = np.sort(num_arr)

for i in reversed(range(0,n)):
    print (num_arr[i])