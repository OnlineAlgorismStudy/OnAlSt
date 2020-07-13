x = int(input("숫자입력: "))

for i in reversed(range(1, x+1)):
    print(' '*(x-i) + '*'*(2*i-1))



