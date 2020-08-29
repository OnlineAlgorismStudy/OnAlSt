# -*- coding: utf-8 -*-
"""
Created on Sun Aug 16 17:01:52 2020

@author: hanso
"""

#아대숲 찐구 0810 문제풀이

import numpy as np

odd_list = []
even_list = []
for i in range(1,11):
    a = int(input())
    if i%2 == 0:
        even_list.append(a) 
    else:
        odd_list.append(a)

print("sum :",f"{sum(even_list)}")
print("avg :",f"{sum(odd_list)/5:>1}")
