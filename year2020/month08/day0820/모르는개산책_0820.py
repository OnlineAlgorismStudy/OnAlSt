# 2020 08 20 Algorithm Study Day 40
# Inji Seo

'''
3행 5열의 배열을 아래 출력 예와 같이 초기화 한 후 출력하는 프로그램을 작성하시오.
숫자사이의 공백은 3칸으로 하고 각 숫자는 2칸으로 오른쪽에 맞추어 출력한다. 예, "%2d   "

출력 예:
   5   8  10   6   4
  11  20   1  13   2
   7   9  14  22   3
'''

mylist1 = [5,8,10,6,4]
mylist2 = [11,20,1,13,2]
mylist3 = [7,9,14,22,3]

for i in range(len(mylist1)):
    mylist1[i] = int(mylist1[i])
    if mylist1[i] == mylist1[len(mylist1)-1]:
        if mylist1[i] < 10:
            print('  ', mylist1[i])
        elif mylist1[i] < 100:
            print(' ', mylist1[i])
    elif mylist1[i] < 10:
        print('  ', mylist1[i], end='')
    elif mylist1[i] < 100:
        print(' ', mylist1[i], end='')

for i in range(len(mylist2)):
    mylist2[i] = int(mylist2[i])
    if mylist2[i] == mylist2[len(mylist2)-1]:
        if mylist2[i] < 10:
            print('  ', mylist2[i])
        elif mylist2[i] < 100:
            print(' ', mylist2[i])
    elif mylist2[i] < 10:
        print('  ', mylist2[i], end='')
    elif mylist2[i] < 100:
        print(' ', mylist2[i], end='')

for i in range(len(mylist3)):
    mylist3[i] = int(mylist3[i])
    if mylist3[i] == mylist3[len(mylist3)-1]:
        if mylist3[i] < 10:
            print('  ', mylist3[i])
        elif mylist3[i] < 100:
            print(' ', mylist3[i])
    elif mylist3[i] < 10:
        print('  ', mylist3[i], end='')
    elif mylist3[i] < 100:
        print(' ', mylist3[i], end='')
