# 2020 08 11 Algorithm Study Day 33
# Inji Seo

'''
10개의 정수를 입력받아 배열에 저장한 후 내림차순으로 정렬하여 출력하시오.

입력 예: 95 100 88 65 76 89 58 93 77 99
출력 예: 100 99 95 93 89 88 77 76 65 58
'''

mylist = input('').split()

while len(mylist) < 10:
    mylist += input('').split()

for i in range(len(mylist)):
    mylist[i] = int(mylist[i])

print(sorted(mylist, reverse = True))
