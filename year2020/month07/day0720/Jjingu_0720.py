# -*- coding: utf-8 -*-
"""
Created on Mon Jul 20 22:12:19 2020

@author: han_song 
"""

#아대숲 찐구 0720 문제풀이

import string

def alpha_tri(num):
    gen_alpha = string.printable[36:]
    k = 0
    for i in reversed(range(1,num+1)):
        print(gen_alpha[k:k+i])
        k = k + i

num = int(input())
if num>2 and num<11:
    alpha_tri(num)
else:
    print("out of range")