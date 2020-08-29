# -*- coding: utf-8 -*-
"""
Created on Wed Aug  5 22:33:54 2020

@author: hansong
"""

#아대숲 찐구 0805 문제풀이

avg = [85.6, 79.5, 83.1, 80.0, 78.2, 75.0]
num = input()
num_re = num.split(' ')

num1 = int(num_re[0])
num2 = int(num_re[1])

print(f"{avg[num1-1]+avg[num2-1]:>1}")
