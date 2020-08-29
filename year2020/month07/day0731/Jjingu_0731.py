# -*- coding: utf-8 -*-
"""
Created on Sun Jul 26 23:27:22 2020

@author: hanso
"""
import numpy as np

def product_express(num1,num2):
    if (num1>1 and num1<10) and (num2>1 and num2<10):
        for count in range(1,10):
            if num1> num2:
                for i in reversed(range(num2,num1+1)):
                    if i == num2:
                        print(f"{i} * {count} =  {i*count:>2}",end ='\n')
                    else:
                        print(f"{i} * {count} =  {i*count:>2}",end='    ')
                
            else:
                for i in range(num1,num2+1):
                    if i == num2:
                        print(f"{i} * {count} =  {i*count:>2}",end ='\n')
                    else:
                        print(f"{i} * {count} =  {i*count:>2}",end='    ')
    
    else:
        print("INPUT ERROR!")

num = input()
num_re = np.uint8(num.split(' '))

num1 = num_re[0]
num2 = num_re[1]

product_express(num1, num2)



