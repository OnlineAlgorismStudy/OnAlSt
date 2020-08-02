n = int(input("숫자입력: "))
for i in range(1, n+1)[::-1] :  
    print(" "*(n-i) + "*"*(i*2-1))
for i in range(2, n+1):  
    print(" "*(n-i) + "*"*(i*2-1))
    
