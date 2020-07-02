animals = ['dog','cat','chick']
num = int(input("Number? "))
if 0 < num < len(animals)+1:
    print(animals[num-1])
else:
    print("I don't know.")
