#찐구 0908 문제 풀이

def function(n):
    x, y = n
    a = max(n)//2
    b = min(n)*2
    if x > y: 
        arr = [a, b]
    else:
        arr = [b, a]
    return arr

num = list(map(int, input().split(' ')))
a, b = function(num)

print(a, b)
