# -*- coding: utf-8 -*-
"""
Created on Mon Jul 13 23:13:01 2020

@author: hansong
"""
#아대숲 찐구 0714 문제풀이

def star(src):
    star_line = ""
    for i in range(0,src):
        star_line = star_line+"*"
        print(star_line)
    
num = int(input())
star(num)