# 2020 08 27 Algorithm Study Day 45
# Inji Seo

'''
4행 3열의 배열을 선언하고 아래의 값으로 초기화 한 후 차례대로 출력한 후 배열의 모든 값을 더한 결과를 출력하는 프로그램을 작성하시오.
{{3, 5, 9}, {2, 11, 5}, {8, 30, 10}, {22, 5, 1}}

출력 예:
    3 5 9
    2 11 5
    8 30 10
    22 5 1
    111
'''

mylist = []
mylist += [[3,5,9],[2,11,5],[8,30,10],[22,5,1]]

print(mylist[0][0], mylist[0][1], mylist[0][2])
print(mylist[1][0], mylist[1][1], mylist[1][2])
print(mylist[2][0], mylist[2][1], mylist[2][2])
print(mylist[3][0], mylist[3][1], mylist[3][2])
print(mylist[0][0]+mylist[0][1]+mylist[0][2]+mylist[1][0]+mylist[1][1]+mylist[1][2]+mylist[2][0]+mylist[2][1]+mylist[2][2]+mylist[3][0]+mylist[3][1]+mylist[3][2])
