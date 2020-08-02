# 2020 07 27 Algorithm Study Day 23
# Inji Seo

'''
자연수 n을 입력받아 "출력 예"와 같이 공백으로 구분하여 출력하는 프로그램을 작성하시오.
주의! 숫자를 공백으로 구분하되 줄사이에 빈줄은 없다.

입력 예: 3
출력 예:
    1
  1 2
1 2 3
'''

number = int(input(''))
pnumber = 1
line = 1
space = number - line
space_ex = 0

while line <= number:
    
    if space_ex == 0:
        print('  '*space, end='')
        space_ex = 1
        space -= 1
    elif pnumber == line:
        print(pnumber)
        line += 1
        pnumber = 1
        space_ex = 0
    else:
        print(pnumber, end=' ')
        pnumber += 1

    
'''
input=10일때
                   1
                 1 2
               1 2 3
             1 2 3 4
           1 2 3 4 5
         1 2 3 4 5 6
       1 2 3 4 5 6 7
     1 2 3 4 5 6 7 8
   1 2 3 4 5 6 7 8 9
1 2 3 4 5 6 7 8 9 10
'''
