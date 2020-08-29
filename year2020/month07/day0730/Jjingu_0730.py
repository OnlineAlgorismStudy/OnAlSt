# -*- coding: utf-8 -*-
"""
Created on Sun Jul 26 23:19:16 2020

@author: hanso
"""
#아대숲 찐구 0730 문제풀이

def odd_square(num):
    a = 1
    for i in range(0,num):
        src = ""
        for i in range(0,num):
            src += str(a)
            a = a+2
            if a == 11:
                a = 1
            else:
                continue
            
        print(src)
            
num = int(input())
odd_square(num)
            
        