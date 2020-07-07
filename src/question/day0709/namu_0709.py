end = False
while not end:
    base = float(input("Base = "))
    height = float(input("Height = "))
    print("Triangle width = ",base * height /2)
    if input("Continue? ").lower() != "y":
        end = True
