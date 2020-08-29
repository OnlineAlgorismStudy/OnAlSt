w = int(input("width: "))
l = int(input("length: "))

w = w + 5
l = l*2

def calculate_area(w, l):
    return w*l

print("width =", w)
print("length = ", l)
print("area = ", calculate_area(w, l))
