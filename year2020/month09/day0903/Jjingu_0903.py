# 아대숲 찐구 0903 문제풀이

def number_square(a):
    number = 1
    for i in range(0,a):
        for j in range(0,a):
            print(number,end=" ")
            number +=1
        
        print()
 
a = int(input())
number_square(a)    
