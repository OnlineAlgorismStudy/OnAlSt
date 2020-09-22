#찐구 0923 문제풀이

from math import floor, sqrt

def function_0923(a,b):
    print(f"{floor(abs(sqrt(a)-sqrt(b)))}")    
    
a, b = list(map(float,input().split(" ")))

function_0923(a, b)
