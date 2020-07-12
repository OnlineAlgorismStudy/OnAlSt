sum = 0

def average():
    count = int(input())
    if count < 11:
        for n in range(count):
            global sum
            score = int(input())
            while score > 100: 
                score = int(input("100이하로입력해주세요: "))

            sum = sum+score
        
        avg = sum/count
        print("avg :", round(sum/count,1))
        
        if avg >= 80:
            print("pass")
        else:
            print("fail")

    else:
        print("1에서 10사이의 정수를 입력해주세요")

average()
