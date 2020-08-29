# 2020 08 24 Algorithm Study Day 42
# Inji Seo

'''
5명 학생의 국어 영어 수학 과학 4과목의 점수를 입력 받아서 각 개인별로
평균이 80 이상이면"합격" 그렇지 않으면"불합격"을 출력하고
합격한 사람의 수를 출력하는 프로그램을 작성하시오.

입력 예:
    85 67 95 65
    80 95 86 56
    100 98 67 86
    95 76 84 65
    67 86 90 76

출력 예:
    fail
    fail
    pass
    pass
    fail
    Successful : 2
'''

first = input('').split()
second = input('').split()
third = input('').split()
fourth = input('').split()
fifth = input('').split()

for i in range(len(first)):
    first[i] = int(first[i])
    second[i] = int(second[i])
    third[i] = int(third[i])
    fourth[i] = int(fourth[i])
    fifth[i] = int(fifth[i])

count = 0

if sum(first)/4 >= 80:
    print('pass')
    count += 1
else:
    print('fail')
if sum(second)/4 >= 80:
    print('pass')
    count += 1
else:
    print('fail')
if sum(third)/4 >= 80:
    print('pass')
    count += 1
else:
    print('fail')
if sum(fourth)/4 >= 80:
    print('pass')
    count += 1
else:
    print('fail')
if sum(fifth)/4 >= 80:
    print('pass')
    count += 1
else:
    print('fail')

print('Successful :', count)
