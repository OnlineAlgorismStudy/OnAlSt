# -*- coding: utf-8 -*-
"""
Created on Mon Jul 20 22:29:14 2020

@author: han_song
"""

#아대숲 찐구 0721 문제풀이 

import string

def alpha_rect(num):
    gen_alpha = string.printable[36:]
    k = 1
    l = 0
    for i in reversed(range(1,num+1)):
        num_str = ""
        for j in range(0,i):
            num_str += str(k)
            k = k+1
        
        print(num_str+gen_alpha[l:l+1+num-i])
        l = l+1+num-i
        

num = int(input())
alpha_rect(num)
