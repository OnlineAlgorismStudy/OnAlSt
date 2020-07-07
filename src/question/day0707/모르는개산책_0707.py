# 2020 07 06 Algorithm Study Day 6
# Inji Seo

# 1번의 개, 2번은 고양이, 3번은 병아리로 정하고 번호를 입력하면 번호에 해당하는 동물을 영어로 출력하는 프로그램을 작성하시오.
# 해당 번호가 없으면 "I don't know."라고 출력한다.
# 개-dog
# 고양이-cat
# 병아리-chick

num = int(input('Number? '))

if num == 1:
    print('dog')
elif num == 2:
    print('cat')
elif num == 3:
    print('chick')
else:
    print("I don't know.")
