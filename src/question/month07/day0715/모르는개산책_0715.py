# 2020 07 15 Algorithm Study Day 15
# Inji Seo

'''
자연수 n을 입력받아서 다음과 같이 출력하는 프로그램을 작성하시오.

입력 예: 3
출력 예:
***
**
*
*
**
***
'''

number = int(input(''))
i = 1
j = number

while j != 0:
    print('*'*j)
    j -= 1
while number+1 != i:
    print('*'*i)
    i += 1
