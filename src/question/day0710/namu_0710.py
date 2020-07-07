num = int(input("num: "))
grades = input("grades: ").split(" ")
parsed = list(map(float, grades))
avg = round(sum(parsed)/num, 1)
print(f"avg : {avg}")
if avg >= 80:
    print("pass")
else:
    print("fail")
