# 2020 08 17 Algorithm Study Day 37
# Inji Seo

'''
정수를 입력받다가 0 이 입력되면 0 을 제외하고 그 때까지 입력 받은 개수를 출력한 후
입력받은 정수를 차례로 출력하되 그 수가 홀수이면 2배한 값을,
짝수인 경우에는 2로 나눈 몫을 출력하는 프로그램을 작성하시오.
입력되는 정수의 개수는 100개 이하이다.

입력 예: 8 10 5 15 100 0
출력 예:
    5
    4 5 10 30 50
'''

mylist = input('').split()

count = 0

for i in range(len(mylist)):
    mylist[i] = int(mylist[i])

while mylist[len(mylist)-1] != 0:
    mylist += input('').split()

for i in range(len(mylist)):
    mylist[i] = int(mylist[i])

del mylist[len(mylist)-1]

for i in range(len(mylist)):
    if mylist[i]%2 == 1:
        mylist[i] = mylist[i]*2
        count += 1
    elif mylist[i]%2 == 0:
        mylist[i] = mylist[i]//2
        count += 1



print(count)
print(mylist)
