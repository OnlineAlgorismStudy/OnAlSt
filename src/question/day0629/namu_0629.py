course = ['kor', 'mat', 'eng']
grade = [90, 80, 100]
for c, g in zip(course, grade):
    print(c, g)
print('sum',sum(grade))
print('avg',sum(grade)//len(grade))
