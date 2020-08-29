# 2020 07 29 Algorithm Study Day 25
# Inji Seo

'''
자연수 n을 입력받아 "출력 예"와 같이 공백으로 구분하여 출력되는 프로그램을 작성하시오.
주의! '#'은 공백으로 구분하되 줄사이에 빈줄은 없다.

입력 예: 3
출력 예:
#
##
###
 ##
  #
'''

number = int(input(''))

line = 1
sharp = 1
space = 1

while line < number*2:
    if line < number:
        print('#'*sharp)
        sharp += 1
        line += 1
    elif line == number:
        print('#'*sharp)
        sharp -= 1
        line += 1
    else:
        print(' '*space + '#'*sharp)
        sharp -= 1
        line += 1
        space += 1
