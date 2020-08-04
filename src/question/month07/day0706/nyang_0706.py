def leapyr():
    n=int(input("year : "))

    if n % 400 == 0:
        print("leap year")

    if n % 4 == 0 and n % 100 != 0:
        print("leap year")

    else:
        print("common year")

leapyr()
