# 2020 08 13 Algorithm Study Day 36
# Inji Seo

'''
100 개 이하의 정수를 입력받다가 0 이 입력되면 그 때까지 입력된 정수 중 5의 배수의 개수와
합계 평균을 출력하는 프로그램을 작성하시오. 평균은 소수점 이하 1자리까지 출력한다.

입력 예: 35 10 23 100 64 51 5 0
출력 예:
    Multiples of 5 : 4
    sum : 150
    avg : 37.5
'''

mylist = input('').split()

count = 0
total = 0

for i in range(len(mylist)):
    mylist[i] = int(mylist[i])

if len(mylist) > 100 or mylist[len(mylist)-1] == 0:

    for i in range(len(mylist)-1):

        if mylist[i]%5 == 0:
            count += 1
            total += mylist[i]

while len(mylist) < 100 and mylist[len(mylist)-1] != 0:

    mylist += input(''). split()

    for i in range(len(mylist)):
        mylist[i] = int(mylist[i])

print('Multiples of 5 :', count)
print('sum :', total)
print('avg :', round(total/count,1))
