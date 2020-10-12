#찐구 1014 문제풀이

def reculsive(n):
    global process
    
    if n%2 == 0:
        a = n//2
    elif n%2 == 1:
        a = n//3
        
    process.append(a)
    if a == 1:
        print(len(process))
        
    else:
        reculsive(a)
        
n = int(input())
process = []
reculsive(n)
