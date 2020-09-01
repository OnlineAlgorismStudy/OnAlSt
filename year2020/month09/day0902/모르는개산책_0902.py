# 2020 09 02 Algorithm Study Day 49
# Inji Seo

'''
반지름의 길이를 전달받아 넓이를 출력하는 함수를 작성하고 반지름의 길이를 입력받아 함수를
호출하려 넓이를 출력하는 프로그램을 작성하시오.
(원주율은 3.14로 하고 반올림하여 소수 둘째자리까지 출력한다.
원의 넓이 = 반지름 * 반지름 * 원주율이다.)

입력 예: 10
출력 예: 314.00
'''

def circle_area(number):
    print(round(number*number*(3.14),2))

number = float(input(''))

circle_area(number)
