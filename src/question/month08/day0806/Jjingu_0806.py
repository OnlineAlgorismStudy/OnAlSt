# -*- coding: utf-8 -*-
"""
Created on Wed Aug  5 22:40:37 2020

@author: hansong
"""
#아대숲 찐구 문제풀이 0806

import numpy as np

num_list = []
while len(num_list)<10:
    a = int(input())
    if a>1000:
        print("It's over 1000, Please input number again")
    else:
        num_list.append(a)

print(np.min(np.array(num_list)))