# 2020 07 28 Algorithm Study Day 24
# Inji Seo

'''
자연수 n을 입력받아 "출력 예"와 같이 공백으로 구분하여 출력되는 프로그램을 작성하시오.
주의! 숫자는 공백으로 구분하되 줄사이에 빈줄은 없다.

입력 예: 3
출력 예:
1 2 3
  4 5
    6
'''

number = int(input(''))
space = 0
pnumber = 1
cnumber = 0
line = 1

while line <= number:
    if cnumber + space == number:
        print(pnumber)
        pnumber += 1
        cnumber = 0
        line += 1
    elif line == space + 1:
        print('  '*space, end='')
        space += 1
    else:
        print(pnumber, end=' ')
        pnumber += 1
        cnumber += 1
