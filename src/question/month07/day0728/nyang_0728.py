n = int(input("숫자입력: "))

count = 0 
for i in range(0,n):
    print()    
    for x in range(0,n):
        if i>x:
            print(" ",end=" ")
        else:
            count = count + 1
            print(count,end=" ")
