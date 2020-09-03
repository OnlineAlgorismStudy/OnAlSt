# 2020 09 08 Algorithm Study Day 53
# Inji Seo

'''
서로 다른 두 개의 정소가 주어진다.
두 정수를 입력받아 큰 수는 2로 나눈 몫을 저장하고 작은 수는 2를 곱하여 저장한 후 출력하는 프로그램을 작성하시오.
(참조에 의한 호출을 이용한 함수를 작성하여 값을 수정하고 출력은 메인함수에서 한다.)

입력 예: 100 500
출력 예: 200 250
'''

mylist = input('').split()

for i in range(len(mylist)):
    mylist[i] = int(mylist[i])

if mylist[0] == mylist[1]:
    print('Error')

def Big(mylist):

    if max(mylist[0], mylist[1]) == mylist[0]:
        mylist[0] = round(mylist[0]/2)
        mylist[1] = mylist[1]*2
    else:
        mylist[0] = mylist[0]*2
        mylist[1] = round(mylist[1]/2)

def main():

    Big(mylist)
    print(mylist)

main()
