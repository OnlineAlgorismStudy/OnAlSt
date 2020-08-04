x=int(input("숫자입력: "))

for i in range(1,x+1):
    print(" "*(i-1) + "*"*(x-i+1))