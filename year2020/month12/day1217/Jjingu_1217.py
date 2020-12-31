from math import sqrt

def solution(n):
    root = sqrt(n)    
    if int(root) == root:
        answer = (root+1)**2
    else:
        answer = -1

    return answer
