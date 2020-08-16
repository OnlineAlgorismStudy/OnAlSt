# -*- coding: utf-8 -*-
"""
Created on Sun Aug 16 18:23:23 2020

@author: hanso
"""
# 아대숲 찐구 0821 문제풀이

import numpy as np

print("First Array")
first = []
for i in range(0,2):
    a = input() 
    a_re = a.split(' ')
    first.append(a_re)
    
print("Second Array")
second = []
for i in range(0,2):
    b = input() 
    b_re = b.split(' ')
    second.append(b_re)
    
first = np.array(first, np.float)
second = np.array(second, np.float)

product = first * second

print(product)