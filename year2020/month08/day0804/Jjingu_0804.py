# -*- coding: utf-8 -*-
"""
Created on Wed Aug  5 22:22:09 2020

@author: hansong
"""

#아대숲 찐구 0804 문제풀이
num_list = []
inp_ok = True

while inp_ok:
    a = int(input())
    if a == 0:
        inp_ok = False
        break
    
    else:
        num_list.append(a)
      
num_list.reverse()
for i in num_list:
    print(i,end=" ")

