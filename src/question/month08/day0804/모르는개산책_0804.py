# 2020 08 04 Algorithm Study Day 29
# Inji Seo

'''
100 개의 정수를 저장할 수 있는 배열을 선언하고 정수를 차례로 입력받다가 0 이 입력되면
0 을 제외하고 그 때까지 입력된 정수를 가장 나중에 입력된 정수부터 차례대로 출력하는 프로그램을 작성하시오.

입력 예: 3 5 10 55 0
출력 예: 55 10 5 3
'''

mylist = input('').split()

b = mylist[len(mylist)-1]
a = len(mylist)-1

while a <= 100:
    if b != str(0):
        mylist += input('')
        a += 1
        b = mylist[a]
    else:
        while a >= 1:
            print(mylist[a-1], end=' ')
            a -= 1
