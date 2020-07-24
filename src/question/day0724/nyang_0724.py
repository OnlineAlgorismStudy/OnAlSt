n = int(input("숫자입력: "))

for i in range(1,n*2,2):
    print(" "*((n*2)-(i-1)),"*"*i)