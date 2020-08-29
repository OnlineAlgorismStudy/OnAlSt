total = []
for i in range(1, 5):
    n = [int(x) for x in input(f'{i}class? ').split()]
    total.append(sum(n))
for i in range(len(total)):
    print(f'{i + 1}class : {total[i]}')
