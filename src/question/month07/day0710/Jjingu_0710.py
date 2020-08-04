# -*- coding: utf-8 -*-
"""
Created on Wed Jul  8 22:48:36 2020

@author: hansong
"""

#아대숲 찐구 0710 문제풀이 
import numpy as np

def PorF(n,score):
    score_re = np.float32(score.split(' '))
    avg = score_re.sum()/n
    print('avg :',avg)
    if avg>=80:
        print("pass")
    else:
        print("fail")

n = int(input())
while n>10:
    print('Wrong Number of subject. The Number of subject should be lower than 11')
    n = int(input())
    
score = input()
while len(score.split(' '))!=n or np.max(np.float32(score.split(' ')))>100 or np.min(np.float32(score.split(' ')))<0:
    if len(score.split(' '))!=n:
        print('The number of subject is not same with the number set already. repeat again')
    elif np.max(np.float32(score.split(' ')))>100 or np.min(np.float32(score.split(' ')))<0:
        print('The score should be in the range between 0 and 100')
        
    score = input()

PorF(n,score)
