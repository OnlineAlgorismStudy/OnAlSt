n = int(input("숫자입력: "))

for i in range(1,n+1):
    for j in range(n-i):
        print(" ", end="")
    for j in range(1,i+1):
        print(str(j), end="")
    print()