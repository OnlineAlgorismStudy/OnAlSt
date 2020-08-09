# 2020 08 07 Algorithm Study Day 32
# Inji Seo

'''
10개의 정수를 입력받아 100 미만의 수 중 가장 큰 수와 100 이상의 수 중 가장 작은 수를 출력하는 프로그램을 작성하시오.
(입력되는 정수의 범위는 1이상 10,000 미만이다. 만약 해당하는 수가 없을 때에는 100 을 출력한다.)

입력 예: 88 123 659 15 443 1 99 313 105 48
출력 예: 99 105

힌트: 100 미만의 수로 입력 가능한 범위는 1~99, 100 이상의 수로 입력 가능한 범위는 100~9999 이다.
     입력값보다 큰수(작은수)를 초기값으로 정하고 작업이 끝난 후 초기값이 그대로 있다면 해당하는 수가 없는 것이다.
     '''
mylist = input('').split()

if len(mylist) < 10:
    mylist += input('').split()
else:
    None

for i in range(len(mylist)):
    mylist[i] = int(mylist[i])

smallest = 10000
largest = 1

for i in range(len(mylist)):
    if 1 <= mylist[i] < 100:
        if mylist[i] > largest:
            largest = mylist[i]
    elif 100 <= mylist[i] <= 10000:
        if mylist[i] < smallest:
            smallest = mylist[i]

print(largest, smallest)
