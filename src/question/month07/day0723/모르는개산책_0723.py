# 2020 07 23 Algorithm Study Day 21
# Inji Seo

'''
자연수 n을 입력받아 "출력 예"와 같이 출력되는 프로그램을 작성하시오.
주의! '*'과 '*' 사이에 공백이 없고 줄사이에도 빈줄이 없다.

입력 예: 3
출력 예:
*****
 ***
  *
 ***
*****
'''

number = int(input(''))
line = 1
line2 = number
space = 0

while line <= 2*number - 1:
    if line < number:
        print(' '*space + '*'*(line2*2-1))
        line += 1
        line2 -= 1
        space += 1
    else:
        print(' '*space + '*'*(line2*2-1))
        line += 1
        line2 += 1
        space -= 1
