# 찐구 1002 문제풀이

def recursive(n):
    print(n,end=" ")
    n-=1
    if n!=0:
        recursive(n)
    
retry =True
while retry:
    n = int(input())
    if n > 0:
        retry = False
    else:
        print("please input natural number")
        
recursive(n)
