# 2020 08 06 Algorithm Study Day 31
# Inji Seo

'''
10개의 정수를 입력받아 그 중 가장 작은 수를 출력하는 프로그램을 작성하시오.
(입력받을 정수는 1000을 넘지 않는다.)

입력 예: 5 10 8 55 6 31 12 24 61 2
출력 예: 2
'''

mylist = input('').split()

if len(mylist) < 10:
    mylist += input('').split()
else:
    None

for i in range(len(mylist)):
    mylist[i] = int(mylist[i])

smallest = mylist[0]

for i in range(len(mylist)):
    if mylist[i] < smallest:
        smallest = mylist[i]

print(smallest)
