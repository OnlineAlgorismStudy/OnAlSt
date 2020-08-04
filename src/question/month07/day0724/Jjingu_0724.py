# -*- coding: utf-8 -*-
"""
Created on Mon Jul 13 23:30:52 2020

@author: hansong
"""
#아대숲 찐구 0724 문제풀이

def star_tri4(num):
    for i in range(0,num):
        value = 2*i+1
        star_line = "*"*value
        print(star_line.rjust(2*num-1))
        
num = int(input())
star_tri4(num)
