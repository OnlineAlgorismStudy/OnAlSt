Land = {'Korea': '1', 'USA': '2', 'Japan': '3', 'China': '4'}

print(Land['Korea'])

while True :

    num = int(input("1. Korea\n2. USA\n3. Japan\n4. China\nnumber? "))

    if num == 1:

        print("Seoul")

    elif num == 2 :

        print("Washington")

    elif num == 3 :

        print("Tokyo")

    elif num == 4 :

        print("Beijing")

    else :

        print("none")
        break
