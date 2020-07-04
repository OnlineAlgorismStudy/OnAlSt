# 2020 07 03 Algorithm Study Day 3
# Inji Seo

# 1야드(yd)는 91.44cm 이고 1인치(in)는 2.54cm 이다.
# 2.1야드와 10.5인치를 각각 cm로 변환하여 다음 형식에 맞추어 소수 첫째자리까지 출력하시오.

# 2.1yd = 192.0cm
# 10.5in = 26.7cm

def yd_to_cm(yd):
    cm = round(yd*91.44,1)
    yd_to_cm_string1 = f'{yd}yd'
    yd_to_cm_string2 = f'{cm}cm'
    print(yd_to_cm_string1, '=', yd_to_cm_string2)

def inch_to_cm(inch):
    cm = round(inch*2.54,1)
    inch_to_cm_string1 = f'{inch}in'
    inch_to_cm_string2 = f'{cm}cm'
    print(inch_to_cm_string1, '=', inch_to_cm_string2)

yd_to_cm(2.1)
inch_to_cm(10.5)
