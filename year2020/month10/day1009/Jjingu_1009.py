#찐구 1009 문제풀이

def recursive(n):
    m = n-2
    if m > 0:
        recursive(m)
        
    print(n, end=' ')


n = int(input())

recursive(n)
