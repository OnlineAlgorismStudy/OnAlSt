# -*- coding: utf-8 -*-
"""
Created on Sun Aug 16 17:12:31 2020

@author: hanso
"""


#아대숲 찐구 0811 문제풀이

import numpy as np

num_list = []
while  len(num_list)<10:
    a = int(input())
    num_list.append(a)

num_arr = np.array(num_list)
num_arr = np.sort(num_arr)

for i in reversed(range(0,10)):
    print (num_arr[i], end=" ")