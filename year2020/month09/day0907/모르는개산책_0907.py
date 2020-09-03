# 2020 09 07 Algorithm Study Day 52
# Inji Seo

'''
10 이하의 두 정수가 주어진다.
이를 입력 받아서 첫 번째 수를 두 번째 수만큼 거듭제곱하여 나온 값을 리턴하는 함수를 작성하여
다음과 같이 출력하는 프로그램을 작성하시오.

입력 예: 2 10
출력 예: 1024
'''

mylist = input('').split()

for i in range(len(mylist)):
    mylist[i] = int(mylist[i])

for i in range(len(mylist)):
    if mylist[i] > 10:
        print('Error')

def Squared (mylist):
    print(mylist[0] ** mylist[1])

Squared(mylist)
