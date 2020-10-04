pi = 3.141592


def find_area(r):
    return round(r ** 2 * pi, 3)


r = float(input('radius : '))
print(f'area = {find_area(r)}')
