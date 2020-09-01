# 2020 08 28 Algorithm Study Day 46
# Inji Seo

'''
4행 2열의 배열을 입력받아 가로평균과 세로 평균 그리고 전체평균을 출력하는 프로그램을 작성하시오. (소수점 이하는 버림 한다.)

입력 예:
    16 27
    39 100
    19 88
    61 20
출력 예:
    21 69 53 40
    33 58
    46
'''

import math

mylist = [list(map(int, input('').split())) for _ in range(4)]

for i in range(len(mylist)):
    if i < len(mylist)-1:
        print(math.floor(sum(mylist[i])/2), end= ' ')
    else:
        print(math.floor(sum(mylist[i])/2))

mylist1 = list(mylist[0])
mylist2 = list(mylist[1])
mylist3 = list(mylist[2])
mylist4 = list(mylist[3])

first = (mylist1[0] + mylist2[0] + mylist3[0] + mylist4[0])/4
second = (mylist1[1] + mylist2[1] + mylist3[1] + mylist4[1])/4

print(math.floor(first), math.floor(second))

print(math.floor((first + second)/2))
        
