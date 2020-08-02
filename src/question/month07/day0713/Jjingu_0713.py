# -*- coding: utf-8 -*-
"""
Created on Mon Jul 13 23:03:28 2020

@author: hansong
"""

#찐구 0713 문제 풀이

def string_product(a,b):
    string = f"{a} * {b} =  {a*b:>2}   "
    return string

for i in range(2,5):
    line =""
    for j in range(1,6):
        line = line+string_product(i,j)
    
    print(line.strip())
