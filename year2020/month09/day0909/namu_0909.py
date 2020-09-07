l = list(map(int, input().split()))
l.sort()


def gugudan(l):
    for i in range(l[0], l[1] + 1):
        print(f'== {i}dan ==')
        for j in range(1, 10):
            print(f'{i} * {j} = {i * j}')
        print('\n')


gugudan(l)
