#찐구 1008 문제풀이

def recursive(n):
    if n > 1:
        m = n//2
        recursive(m)
        
    print(n, end=' ')


n = int(input())

recursive(n)
