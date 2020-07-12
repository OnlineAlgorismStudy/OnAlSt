# 2020 07 10 Algorithm Study Day 10
# Inji Seo

# 10 이하의 과목수 n이 주어진다.
# 정수로 주어진 n개 과목의 점수를 입력받아서 실수 평균을 구하여 출력하고
# 평균이 80점이상이면 "pass", 80점 미만이면 "fail"이라고 출력하는 프로그램을 작성하시오.
# 평균은 반올림하여 소수 첫째자리까지 출력한다.

num_class = int(input(''))
grade = []

if num_class <= 10:
    
    grade = list(int(num) for num in input("").strip().split())
    grade_sum = round(sum(grade)//num_class, 2)

    if grade_sum >= 80:
        print('avg :', grade_sum)
        print('"pass"')
        
    else:
        print('avg :', grade_sum)
        print('"fail"')

else:
    None
