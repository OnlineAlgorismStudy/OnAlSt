# 2020 07 03 Algorithm Study Day 4
# Inji Seo

# 직사각형의 가로와 세로의 길이를 정수형 값으로 입력받은 후 가로의 길이는 5 증가시키고 세로의 길이는 2배하여 저장한 후 가로의 길이 세로의 길이 넓이를 차례로 출력하는 프로그램을 작성하시오.

# 입력: 20 15
# 출력: width = 25
# length = 30
# area = 750


elements = input('').split(' ')
list1 = list(map(int, elements))

width = list1[0]+5
length = list1[1]*2

print('width =', width)
print('length =', length)
print('area =', width*length)

