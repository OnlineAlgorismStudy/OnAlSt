def leapyr(n):
    if n % 400 == 0:
        return "leap year"

    if n % 4 == 0 and n % 100 != 0:
        return "leap year"

    else:
        return "common year"
print leapyr(2008)
