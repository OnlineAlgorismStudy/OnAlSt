# -*- coding: utf-8 -*-
"""
Created on Mon Jul 13 23:30:52 2020

@author: hansong
"""
#아대숲 찐구 0716 문제풀이

def star_tri(num):
    for i in range(0,num):
        value = num-i
        star_line = "*"*value
        print(star_line.rjust(num))
        
num = int(input())
star_tri(num)
