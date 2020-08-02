# 2020 07 30 Algorithm Study Day 26
# Inji Seo

'''
자연수 n을 입력받아 "출력 예"와 같이 n x n크기에 공백으로 구분하여 출력되는 프로그램을 작성하시오.
10 미만의 홀수만 출력하시오.주의! 숫자는 공백으로 구분하되 줄사이에 빈줄은 없다.

입력 예: 3
출력 예:
1 3 5
7 9 1
3 5 7
'''

number = int(input(''))

pnumber = 1
column = 1
row = 1

while row <= number and column <= number:
    if pnumber > 10:
        pnumber = 1
    if column == number:
        print(pnumber)
        column = 1
        row += 1
        pnumber += 2
    else:
        print(pnumber, end = ' ')
        column += 1
        pnumber += 2
