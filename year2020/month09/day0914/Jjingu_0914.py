#찐구 0914 문제풀이

def square(a):
    for i in range(1,a+1):
        for j in range(1,a+1):
            print(i*j,end=' ')
        print()

a = int(input())
square(a)
