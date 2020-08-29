# -*- coding: utf-8 -*-
"""
Created on Sun Aug 16 17:46:44 2020

@author: hanso
"""

import numpy as np

num_list = []
rep = True
while rep==True:
    a = int(input())
    if a==0:
        break
    else:
        num_list.append(a)

num_arr = np.array(num_list)
even = np.where(num_arr%2==0)
odd = np.where(num_arr%2!=0)

num_arr[even] = num_arr[even]/2
num_arr[odd] = 2*num_arr[odd] 

print(len(num_arr))
for i in range(0, len(num_arr)):
    print (num_arr[i], end=" ")
