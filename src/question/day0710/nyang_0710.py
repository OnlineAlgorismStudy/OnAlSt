def average():
    s = 0
    n=int(input("과목의 갯수: "))

    for x in range(1,n+1):
        a=float(input("%d번째 과목 점수: "%(x)))
        s+=a


    print("avg : %.2f "%(round(s/n,1)))


    if s/n >= 80:
        print("pass")

    else:
        print("fail")

average()