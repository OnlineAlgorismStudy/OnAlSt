n = int(input("숫자입력: "))
num=1
for i in range(1,n+1):
    print("# "*i)
    
for i in range(n-1,0,-1):
    print(" "*num,"# "*i)    
    num=num+1