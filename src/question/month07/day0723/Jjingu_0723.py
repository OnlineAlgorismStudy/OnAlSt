# -*- coding: utf-8 -*-
"""
Created on Mon Jul 20 23:21:14 2020

@author: hanso
"""
#아대숲 찐구 0723 문제풀이

def star_sandwatch(num):
    for i in range(0,2*num-1):
        if i >= num:
            value = (2*(i-num+1)+1)
        else:
            value = 2*(num-i)-1
            
        star_line = "*"*value
        print(star_line.center(2*num-1))
        
num = int(input())
star_sandwatch(num)