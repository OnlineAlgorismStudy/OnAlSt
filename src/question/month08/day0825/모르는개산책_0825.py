# 2020 08 25 Algorithm Study Day 43
# Inji Seo

'''
학생들의 점수를 입력을 받다가 0이 입력되면 그 때까지 입력받은 점수를 10점 단위로 구분하여
점수대별 학생 수를 출력하는 프로그램을 작성하시오.
(1명도 없는 점수는 출력하지 않는다.) 학생은 최대 100명이하이다.

입력 예: 63 80 95 100 46 64 88 0
출력 예:
    100 : 1 person
    90 : 1 person
    80 : 2 person
    60 : 2 person
    40 : 1 person
'''

mylist = input('').split()

for i in range(len(mylist)):
    mylist[i] = int(mylist[i])

grade100 = 0
grade90 = 0
grade80 = 0
grade70 = 0
grade60 = 0
grade50 = 0
grade40 = 0
grade30 = 0
grade20 = 0
grade10 = 0
grade0 = -1

while mylist[len(mylist)-1] != 0 and len(mylist) < 100:
    mylist += input('').split()

    for i in range(len(mylist)):
        mylist[i] = int(mylist[i])

for i in range(len(mylist)):
    if mylist[i] < 10:
        grade0 += 1
    elif mylist[i] < 20:
        grade10 += 1
    elif mylist[i] < 30:
        grade20 += 1
    elif mylist[i] < 40:
        grade30 += 1
    elif mylist[i] < 50:
        grade40 += 1
    elif mylist[i] < 60:
        grade50 += 1
    elif mylist[i] < 70:
        grade60 += 1
    elif mylist[i] < 80:
        grade70 += 1
    elif mylist[i] < 90:
        grade80 += 1
    elif mylist[i] < 100:
        grade90 += 1
    else:
        grade100 += 1

if grade100 > 0:
    print('100 :', grade100, 'person')
if grade90 > 0:
    print('90 :', grade90, 'person')
if grade80 > 0:
    print('80 :', grade80, 'person')
if grade70 > 0:
    print('70 :', grade70, 'person')
if grade60 > 0:
    print('60 :', grade60, 'person')
if grade50 > 0:
    print('50 :', grade50, 'person')
if grade40 > 0:
    print('40 :', grade40, 'person')
if grade30 > 0:
    print('30 :', grade30, 'person')
if grade20 > 0:
    print('20 :', grade20, 'person')
if grade10 > 0:
    print('10 :', grade10, 'person')
