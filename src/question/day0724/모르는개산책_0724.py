# 2020 07 24 Algorithm Study Day 22
# Inji Seo

'''
자연수 n을 입력받아 "출력 예"와 같이 n줄에 걸처 오른쪽으로 정력된 삼각형이 출력되는 프로그램을 작성하시오.
'*'사이에 공백이 없고 줄사이에도 빈줄이 없다.

입력 예: 3
출력 예:
    *
  ***
*****
'''

number = int(input(''))
line = 1
star = 1
space = number*2-2

while line <= number:
    print(' '*space, end='')
    space -= 2
    print('*'*star)
    star += 2
    line += 1
