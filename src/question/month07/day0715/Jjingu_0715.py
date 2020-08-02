# -*- coding: utf-8 -*-
"""
Created on Mon Jul 13 23:19:43 2020

@author: hanso
"""

#아대숲 찐구 0715 문제풀이

def star_ribbon(num):
    for i in range(0,num):
        value = num-i
        star_line = "*"*value
        print(star_line)

    for i in range(0,num):
        star_line = "*"*(i+1)
        print(star_line)
        
num = int(input())
star_ribbon(num)
