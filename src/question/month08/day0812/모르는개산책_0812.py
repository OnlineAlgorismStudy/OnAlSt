# 2020 08 12 Algorithm Study Day 34
# Inji Seo

'''
10개의 정수를 입력받아 홀수 번째 입력받은 정수의 합과 짝수 번째 입력받은 정수의 합을 출력하는 프로그램을 작성하시오.

입력 예: 10 20 25 66 83 7 22 90 1 100
출력 예:
    odd : 141
    even : 283
'''

mylist = input('').split()

while len(mylist) < 10:
    mylist += input('').split()

for i in range(len(mylist)):
    mylist[i] = int(mylist[i])

odd = 0
even = 0
count = 0

while count < len(mylist):
    if count%2 == 1:
        even += mylist[count]
        count += 1
    elif count%2 == 0:
        odd += mylist[count]
        count += 1

print('odd :', odd)
print('even :', even)
