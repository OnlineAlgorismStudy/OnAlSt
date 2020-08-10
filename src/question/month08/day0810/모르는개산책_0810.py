# 2020 08 10 Algorithm Study Day 32
# Inji Seo

'''
10개의 정수를 입력받아 배열에 저장한 후 짝수 번쨰 입력된 갑의 합과 홀수 번째 입력된 값의 평균을 출력하는 프로그램을 작성하시오.
평균은 반올림하려 소수첫째자리까지 출력한다.

입력 예: 95 100 88 65 76 89 58 93 77 99
출력 예:
    sum : 446
    avg : 78.8
'''

mylist = input('').split()

count = 0
odd_count = 0
even_sum = 0
odd_sum = 0

while len(mylist) < 9:
    mylist += input('').split()

for i in range(len(mylist)):
    mylist[i] = int(mylist[i])

while count < len(mylist):
    if count%2 == 1:
        even_sum += mylist[count]
        count += 1
    elif count%2 == 0:
        odd_sum += mylist[count]
        odd_count += 1
        count += 1

print('sum :', even_sum)
print('avg :', round(odd_sum/odd_count,2))
