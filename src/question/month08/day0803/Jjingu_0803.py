# -*- coding: utf-8 -*-
"""
Created on Sun Jul 26 23:27:22 2020

@author: hanso
"""

alpha = input()
alpha_re = alpha.split(' ')

if len(alpha_re)!=10:
    print("Input Error")
else:
    print(alpha_re[0],alpha_re[3],alpha_re[6])
