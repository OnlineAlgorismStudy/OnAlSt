# 2020 07 06 Algorithm Study Day 6
# Inji Seo

# 년도를 입력받아 윤년(leap year)인지 평년(common year)인지 판단하는 프로그램을 작성하시오.

# 입력 2008
# 출력 leap year

year = int(input(''))

if year%4 == 0:
    print('leap year')
else:
    print('common year')
