# -*- coding: utf-8 -*-
"""
Created on Wed Jul  8 22:19:23 2020

@author: hansong
"""

#아대숲 찐구 0708 문제 풀이

def num2country():
    action = True
    city = ['Seoul','Washington','Tokyo','Beijing']
    while action:
        print('1. Korea\n2. USA\n3. Japan\n4. China')
        num = int(input('number?'))
        if num>0 and num<5:
            print(city[num-1])
            continue
        else:
            print('none')
            action=False

num2country()