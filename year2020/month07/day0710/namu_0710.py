num = int(input("num: "))
if num < 11:
    grades = input("grades: ").split(" ")
    parsed = list(map(float, grades))
    avg = round(sum(parsed)/num, 1)
    print(f"avg : {avg}")
    if avg >= 80:
        print("pass")
    else:
        print("fail")
else:
    print("Can't have 10 course!")
