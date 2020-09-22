#찐구 0925 문제풀이

def function_0925(n):
    print(2**n)

n = int(input())
while n<1 or n>20:
    n= int(input('1 ≤ n ≤ 20'))
    
function_0925(n)
