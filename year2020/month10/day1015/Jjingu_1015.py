#찐구 1015 문제풀이

def recursive(n, m):
    x = len(str(n))
    y = n//10**(x-1)
    
    m*= y
    z = n-(y*10**(x-1))
    if z < 10:
        print(m)
        
    else:
        recursive(z,m)
    
    

a, b, c = map(int,input().split(' '))
n = a*b*c
m = 1

recursive(n,m)
