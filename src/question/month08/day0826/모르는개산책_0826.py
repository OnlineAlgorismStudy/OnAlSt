# 2020 08 26 Algorithm Study Day 44
# Inji Seo

'''
호석이네 학교는 6학년이 네 반이 있는데 각 반의 대표를 세 명씩 선발하여 제기차기 시합을 하였다.
반별로 세 명이 제기를 찬 개수를 입력받아 각 반별로 제기를 찬 개수의 합계를 출력하는 프로그램을 작성하시오.
(반드시 배열을 이용하고 입력후에 출력하는 방식으로 하세요.)

입력 예:
    1class? 15 2 35
    2class? 33 1 6
    3class? 5 10 19
    4class? 1 8 55
출력 예:
    1class : 52
    2class : 40
    3class : 34
    4class : 64
'''

class1 = input('1class : ').split()
class2 = input('2class : ').split()
class3 = input('3class : ').split()
class4 = input('4class : ').split()

for i in range(len(class1)):
    class1[i] = int(class1[i])
    class2[i] = int(class2[i])
    class3[i] = int(class3[i])
    class4[i] = int(class4[i])

print('1class :', sum(class1))
print('2class :', sum(class2))
print('3class :', sum(class3))
print('4class :', sum(class4))
