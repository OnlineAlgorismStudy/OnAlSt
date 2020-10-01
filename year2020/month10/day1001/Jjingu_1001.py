# 찐구 1001 문제풀이

def recursive(n):
    print("recursive")
    n-=1
    if n!=0:
        recursive(n)
    
retry =True
while retry:
    n = int(input())
    if n>0 and n<21:
        retry = False
    else:
        print("input should be in a range(0 < n <20)")
        
recursive(n)
