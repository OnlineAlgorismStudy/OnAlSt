# 2020 08 19 Algorithm Study Day 39
# Inji Seo

'''
영문 대문자를 입력받다가 대문자 이외의 문자가 입력되면 입력을 중단하고
영문 대문자들에 대하여 1번 이상 입력된 각 문자와 그 문자의 개수를 사전 순으로 출력하는 프로그램을 작성하시오.

입력 예: A B C F F F B Z !

출력 예:
    A : 1
    B : 2
    C : 1
    F : 3
    Z : 1
'''

mylist = input('').split()

for i in range(len(mylist)):
    mylist[i] = str(mylist[i])

upper = ['A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z']

while mylist[len(mylist)-1] in upper:
    mylist += input('').split()

    for i in range(len(mylist)-1):
        mylist[i] = str(mylist[i])

del mylist[len(mylist)-1]
mylist = sorted(mylist)

count = 0
count_alpha = 0
count_num = 0

while count <= len(mylist):
    if count == len(mylist):
        print(mylist[count-1], ':', count_num)
        count += 1
    elif mylist[count] == mylist[count_alpha]:
        count_num += 1
        count += 1
    else:
        print(mylist[count-1], ':', count_num)
        count_alpha = count
        count += 1
        count_num = 1
