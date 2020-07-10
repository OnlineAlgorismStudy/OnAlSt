# 2020 07 09 Algorithm Study Day 9
# Inji Seo

# 삼각형의 밑변의 길이와 높이를 입력받아 넓이를 출력하고, "Continue? "에서 하나의 문자를 입력받아 'Y' 나 'y' 이면 작업을 반복하고 다른 문자이면 종료하는 프로그램을 작성하시오.
# (넓이는 반올림하려 소수 첫째자리까지 출력한다.)

i = 0

while i == 0:
    base = float(input('Base = '))
    if base > 0:
        height = float(input('Height = '))
    else:
        i = 1
    if height > 0:
        print('Triangle width =', round(0.5*base*height, 1))
        cont = str(input('Continue? '))
    else:
        i = 1
    if cont != 'y' and cont != 'Y':
        i = 1
