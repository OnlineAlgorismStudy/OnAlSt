# 2020 07 03 Algorithm Study Day 1
# Inji Seo

# 다음 출력 예와 같이 출력되는 프로그램을 작성하시오.
# 합계와 평균은 수식을 이용하세요.

# kor 90
# mat 80
# eng 100
# sum 270
# avg 90

course = ['kor', 'mat', 'eng']
grade = [90, 80, 100]

for i, j in zip(course, grade):
    print(i, j)

for k in grade:
    sum_ = sum(grade)
avg = sum_//len(grade)

print('sum', sum_)
print('avg', avg)
