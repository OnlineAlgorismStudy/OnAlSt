# -*- coding: utf-8 -*-
"""
Created on Sun Jul 26 22:51:54 2020

@author: hanso
"""
# 아대숲 찐구 0728 풀이
def num_tri2(num):
    k = 1
    for i in reversed(range(1,num+1)):
        num_str = ""
        for j in range(0,i):
            num_str += " "+str(k%10)
            k = k+1
        
        print(num_str.rjust(num*2))
        

num = int(input())
num_tri2(num)

