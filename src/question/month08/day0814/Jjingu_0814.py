# -*- coding: utf-8 -*-
"""
Created on Sun Aug 16 17:35:49 2020

@author: hanso
"""


#아대숲 찐구 0814 문제풀이

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
num_re = np.delete(num_arr.copy(),np.where(num_arr%5!=0))

print("Multiples of 5 :", len(num_re))
print("sum :",f"{sum(num_re)}")
print("avg :",f"{sum(num_re)/len(num_re):>1}")