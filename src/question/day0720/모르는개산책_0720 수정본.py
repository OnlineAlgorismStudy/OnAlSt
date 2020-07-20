# 2020 07 20 Algorithm Study Day 18
# Inji Seo

'''
자연수 n( 3 <= n <= 10) 을 입력받아 다음과 같이 영문자를 출력하는 프로그램을 작성하시오.

입력 예: 3
출력 예:
ABC
DE
F
'''

import string

alpha_list = list(string.ascii_uppercase)+list(string.ascii_lowercase)+list(string.punctuation)

number = int(input(''))
a = 0
b = 0

while number > 0:
    
    if a == number-1:
        print(alpha_list[b])
        a = 0
        b += 1
        number -= 1

    else:
        print(alpha_list[b], end = '')
        a += 1
        b += 1
