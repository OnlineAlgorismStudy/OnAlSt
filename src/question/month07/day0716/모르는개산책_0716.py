# 2020 07 16 Algorithm Study Day 16
# Inji Seo

'''
자연수 n을 입력받아서 다음과 같이 출력하는 프로그램을 작성하시오.

입력 예: 3
출력 예:
***
 **
  *
'''

number = int(input(''))
enter = 0

while number != 0:
    print(' '*enter+'*'*number)
    number -= 1
    enter += 1
