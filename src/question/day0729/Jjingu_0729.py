# -*- coding: utf-8 -*-
"""
Created on Sun Jul 26 23:02:29 2020

@author: hanso
"""


#아대숲 찐구 0729 문제풀이

def sharp_shape(num):
    for i in range(1,2*num):
        if i <= num:
            print((i*" #").ljust(num*2))
        else:
            print(((2*num-i)*" #").rjust(num*2))
        
num = int(input())
sharp_shape(num)