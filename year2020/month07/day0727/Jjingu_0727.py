# -*- coding: utf-8 -*-
"""
Created on Sun Jul 26 22:46:23 2020

@author: hanso
"""


#아대숲 찐구 0727 문제풀이


def num_tri(num):
    num_line = ''
    for i in range(1,num+1):
        num_line = num_line + str(i)
        print(num_line.rjust(num))
        
num = int(input())
num_tri(num)