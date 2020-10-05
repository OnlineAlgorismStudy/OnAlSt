#찐구 1005 문제풀이

def recursive(n,m):
    m += n
    n -= 1
    if n!=0:
        recursive(n,m)
    else:
        print(m)
    
m = 0

n = int(input())

recursive(n, m)
