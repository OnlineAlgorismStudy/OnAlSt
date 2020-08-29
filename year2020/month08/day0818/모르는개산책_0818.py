# 2020 08 18 Algorithm Study Day 38
# Inji Seo

'''
20 이하의 정수 n을 입력받고 n명의 점수를 입력받아 높은 점수부터 차례로 출력하는 프로그램을 작성하시오.

입력 예:
    5
    35 10 35 100 64
출력 예:
    100
    64
    35
    35
    10
'''

number = int(input(''))

mylist = input('').split()

for i in range(len(mylist)):
    mylist[i] = int(mylist[i])

if number <= 20 and len(mylist) == number:
    mylist.sort(reverse=True)
    for i in range(len(mylist)):
        print(mylist[i])
    
