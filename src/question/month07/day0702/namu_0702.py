numYd = float(input("yard? "))

def convert_yd_to_cm(num):
    ydToCm = 91.44
    return round(num * ydToCm, 1)

print(f'{numYd}yard = {convert_yd_to_cm(numYd)}cm')
