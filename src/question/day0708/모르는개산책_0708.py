# 2020 07 08 Algorithm Study Day 8
# Inji Seo

# 아래와 같이 나라 이름을 출력하고 숫자를 입력받아 해당하는 나라의 수도를 출력하는 작업을 반복하다가 해당하는 번호 이외의 숫자가 입력되며 "none"라고 출력한 후 종료하는 프로그랩을 작성하시오.

# 각 나라의 수도:
#   대한민국 = 서울(Seoul)
#   미국 = 워싱턴(Washington)
#   일본 = 동경(Tokyo)
#   중국 = 북경(Beijing)

# 입출력시 모양은 "입.출력예"와 같이 하시오.

print('1. Korea\n2. USA\n3. Japan\n4. China')
capital = int(input('number? '))

if capital == 1:
    print('Seoul')
elif capital == 2:
    print('Washington')
elif capital == 3:
    print('Tokyo')
elif capital == 4:
    print('Beijing')
else:
    print('none')
