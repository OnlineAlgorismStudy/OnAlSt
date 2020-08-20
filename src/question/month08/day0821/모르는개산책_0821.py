# 2020 08 21 Algorithm Study Day 41
# Inji Seo

'''
2행 4열의 배열 두 개를 만들어서 입력을 받고 두 배열의 곱을 구하여 출력하는 프로그램을 작성하시오.

입력 예:
    first array
    1 2 3 4
    5 6 7 8
    second array
    1 4 7 8
    3 6 9 8

출력 예:
    1 8 21 32
    15 36 63 64
'''

first_array1 = input('first array\n').split()
first_array2 = input('').split()

second_array1 = input('second array\n').split()
second_array2 = input('').split()

for i in range(len(first_array1)):
    first_array1[i] = int(first_array1[i])
for i in range(len(first_array2)):
    first_array2[i] = int(first_array2[i])
for i in range(len(second_array1)):
    second_array1[i] = int(second_array1[i])
for i in range(len(second_array2)):
    second_array2[i] = int(second_array2[i])

for i in range(len(first_array1)):
    if first_array1[i] == first_array1[len(first_array1)-1]:
        print(first_array1[i]*second_array1[i])
    else:
        print(first_array1[i]*second_array1[i], end=' ')

for i in range(len(first_array2)):
    if first_array2[i] == first_array2[len(first_array2)-1]:
        print(first_array2[i]*second_array2[i])
    else:
        print(first_array2[i]*second_array2[i], end=' ')
