def average():   
    
    while True:
     
        try:
            s = 0
            n = int(input("과목의 갯수: "))
            if n < 1 or n > 10:
                raise ValueError 
        
        except ValueError:
            print("1-10까지의 숫자를 입력해주세요.")
            continue
            

        for x in range(1,n+1):
            a=float(input("%d번째 과목 점수: "%(x)))
            s+=a


        print("avg : %.2f "%(round(s/n,1)))


        if s/n >= 80:
            print("pass")

        else:
            print("fail")

average()