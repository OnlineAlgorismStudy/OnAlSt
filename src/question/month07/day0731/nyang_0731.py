
n=1
while(n != 0):
    n=int(input("숫자입력: "))
    if n == 0: break
    if not(n>=1 and n <=9):
        print("INPUT ERROR!")
        continue
    else:
        for i in range(1,10):
            print(str(n), "X", str(i), "=", str(n*i))
