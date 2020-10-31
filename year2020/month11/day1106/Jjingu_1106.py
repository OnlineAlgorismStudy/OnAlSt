#찐구 1106 문제풀이

mylist = list(input().split(" "))
for i in range(len(mylist)):
    if (i+1)%2==1:
        print(mylist[i])
