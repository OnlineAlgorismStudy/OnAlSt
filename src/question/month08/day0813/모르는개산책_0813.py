# 2020 08 13 Algorithm Study Day 35
# Inji Seo

'''
세 자리 이하의 정수를 차례로 입력 받다가 999가 입력되면 프로그램을 종료하고
그 때까지 입력된 최댓값과 최소값을 출력하는 프로그램을 작성하시오.
입력받은 정수는 100개 이하이다.

입력 예: 45 19 123 58 10 -55 16 -1 999
출력 예:
    max : 123
    min : -55
'''

mylist=input('').split()

minimum = 999
maximum = -999

for i in range(len(mylist)):
    mylist[i] = int(mylist[i])

if len(mylist) > 100 or mylist[len(mylist)-1] == 999:

    for i in range(len(mylist)-1):
        
        if minimum > mylist[i]:
            minimum = mylist[i]
            
        if maximum < mylist[i]:
            maximum = mylist[i]

while len(mylist) < 100 and mylist[len(mylist)-1] != 999:

    mylist += input('').split()

    mylist[len(mylist)-1] = int(mylist[len(mylist)-1])

print('max :', maximum)
print('min :', minimum)
