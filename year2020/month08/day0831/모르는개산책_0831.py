# 2020 08 31 Algorithm Study Day 47
# Inji Seo

'''
3행 5열의 2차원 문자배열을 선언하고 차례로 대문자를 입력 받은 후 소문자로 바꾸어서 공백으로 구분하여 출력하는 프로그램을 작성하시오.

입력 예:
    A B C D E
    F G H I J
    K L M N O
출력 예:
    a b c d e
    f g h i j
    k l m n o
'''

import string

mylist = [list(map(str, input('').split())) for _ in range(3)]

mylist1 = list(mylist[0])
mylist2 = list(mylist[1])
mylist3 = list(mylist[2])

for i in range(len(mylist1)):

    mylist1[i] = mylist1[i].lower()

    if i+1 == len(mylist1):
        print(mylist1[i])
    else:
        print(mylist1[i], end=' ')

for i in range(len(mylist2)):

    mylist2[i] = mylist2[i].lower()

    if i+1 == len(mylist2):
        print(mylist2[i])
    else:
        print(mylist2[i], end=' ')

for i in range(len(mylist3)):

    mylist3[i] = mylist3[i].lower()

    if i+1 == len(mylist3):
        print(mylist3[i])
    else:
        print(mylist3[i], end=' ')
