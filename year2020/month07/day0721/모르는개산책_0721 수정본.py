# 2020 07 21 Algorithm Study Day 19
# Inji Seo

'''
자연수 n을 입력받아서 n개의 줄에 n+1개의 숫자 혹은 문자로 채워서 다음과 같이 출력하는 프로그램을 작성하시오.

입력 예: 3
출력 예:
1 2 3 A
4 5 B C
6 D E F
'''

import string

alpha_list = list(string.ascii_uppercase)

count_number = int(input(''))

number = 1
alpha = 0

row = count_number
column = count_number + 1

count_row = 1 # 아래로 가는거
count_column = 1 # 오른쪽으로 가는거

while count_row <= row and count_column <= column:
    if column == count_column:
        print(alpha_list[alpha])
        alpha += 1
        count_row += 1
        count_column = 1
    elif column - count_column >= count_row:
        print(number, end=' ')
        number += 1
        count_column += 1
    else:
        print(alpha_list[alpha], end=' ')
        alpha += 1
        count_column += 1
