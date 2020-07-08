# -*- coding: utf-8 -*-
"""
Created on Wed Jul  8 22:48:36 2020

@author: hansong
"""

#아대숲 찐구 0710 문제풀이 
import numpy as np

def PorF(n,score):
    score_re = np.float32(score.split(' '))
    avg = rount(score_re.sum()/n,1)
    print('avg :',avg)
    if avg>=80:
        print("pass")
    else:
        print("fail")

n = int(input())
score = input()

PorF(n,score)
