numYd = 2.1
numIn = 10.5


def convert_yd_to_cm(num):
    ydToCm = 91.44
    return round(num * ydToCm, 1)


def convert_in_to_cm(num):
    inToCm = 2.54
    return round(num * inToCm, 1)


print(f'{numYd}yd = {convert_yd_to_cm(numYd)}cm')
print(f'{numIn}in = {convert_in_to_cm(numIn)}cm')
