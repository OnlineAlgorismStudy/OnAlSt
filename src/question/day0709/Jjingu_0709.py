# -*- coding: utf-8 -*-
"""
Created on Wed Jul  8 22:32:50 2020

@author: hansong
"""

#아대숲 찐구 0709 문제풀이
cont = True
while cont:
    base = float(input('Base = '))
    height = float(input('Height = '))
    print(f'Triangle width = {round(base*height/2,1)}')
    repeat = input('Continue? ')
    if repeat!= 'y' and repeat!='Y':
        cont = False
    else:
        continue
        
