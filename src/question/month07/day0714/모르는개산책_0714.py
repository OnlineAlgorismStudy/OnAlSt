# 2020 07 14 Algorithm Study Day 14
# Inji Seo

'''
자연수 n을 입력받아서 n줄만큼 다음과 같이 출력하는 프로그램을 작성하시오.

입력 예: 5
출력 예:
*
**
***
****
*****
'''

row = int(input(''))
i = 0

while row+1 != i:
    print('*'*i)
    i += 1
