# -*- coding: utf-8 -*-
"""
Created on Sun Aug 16 17:23:57 2020

@author: hanso
"""
#아대숲 찐구 0813 문제풀이

import numpy as np

num_list = []
while len(num_list)<10:
    a = int(input())
    if a>999 and a<-999:
        print("It is out of range")
    else:
        if a==999:
            break
        else:
            num_list.append(a)

print("max :",f"{max(num_list)}")
print("min :",f"{min(num_list)}")
