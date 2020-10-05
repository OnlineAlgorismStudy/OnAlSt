#찐구 1006 문제풀이

def recursive(n, i, mylist):
    m = mylist[i]
    i+=1
    a = mylist[(i+1)//2-1]+m
    
    mylist.append(a)
    
    if i==n-1:
        print(a)
    else:
        recursive(n,i,mylist)

n = int(input())

i=0

mylist = [1]
recursive(n, i, mylist)
