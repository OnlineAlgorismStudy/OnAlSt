def triangle(b, h):      
    area = b * h / 2
    return area



while True:
    b = input("Base =")
    a1 = int (b)

    h = input("Height =")
    a2 = int (h)
    print("Triangle width =")
    print(round(triangle(a1, a2),2)) 

    c = input("Continue?: ")
    if c.capitalize() == "Y":
        print("YES!")
    else:
        print("No!")
        break
