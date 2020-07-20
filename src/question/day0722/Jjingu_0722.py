# -*- coding: utf-8 -*-
"""
Created on Mon Jul 20 23:21:14 2020

@author: hanso
"""
#아대숲 찐구 0722 문제풀이

def star_tri3(num):
    for i in range(0,2*num):
        if i > num:
            print((2*num-i)*"*")
        else:
            print(i*"*")
        
num = int(input())
star_tri3(num)