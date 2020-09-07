# 2020 09 04 Algorithm Study Day 51
# Inji Seo

'''
세 개의 정수를 전달받아 최대값을 구하여 리턴하는 함수를 작성하고
세 정수를 입력받아 최대값을 출력하는 프로그램을 작성하시오.

입력 예: -10 115 33
출력 예: 115
'''

mylist = input('').split()

for i in range(len(mylist)):
    mylist[i] = int(mylist[i])

def Max(mylist):
    print(max(mylist[0], mylist[1], mylist[2]))

Max(mylist)
