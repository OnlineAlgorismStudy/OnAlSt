# -*- coding: utf-8 -*-
"""
Created on Wed Aug  5 22:47:03 2020

@author: hanso
"""
#아대숲 찐구 0807 문제풀이

import numpy as np

num_list = []
while len(num_list)<10:
    a = int(input())
    if a>9999 and a<1:
        print("It's not in the input range(1~9999)")
    else:
        num_list.append(a)

arr = np.array(num_list)
num_100 = np.delete(arr.copy(),np.where(arr>=100))
num_1000 = np.delete(arr.copy(),np.where(arr<100))

if len(num_100)==0 and len(num_1000)==0:
    print(100,100)
elif len(num_1000)==0:
    print(np.max(num_100),100)
elif len(num_100)==0:
    print(100,np.min(num_1000))
else:
    print(np.max(num_100),np.min(num_1000))