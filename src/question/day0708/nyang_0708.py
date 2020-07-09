Land = {'Korea': '1', 'USA': '2', 'Japan': '3', 'China': '4'}

print(Land['Korea'])

while True :

    num = int(input("1. Korea\n2. USA\n3. Japan\n4. China\nnumber? "))

    if Land == 1:

        print("Seoul")

    elif Land == 2 :

        print("Washington")

    elif Land == 3 :

        print("Tokyo")

    elif Land == 4 :

        print("Beijing")

    else :

        print("none")
