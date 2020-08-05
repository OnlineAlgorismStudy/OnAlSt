s = int(input("Start No: "))
e = int(input("End No: "))

def line_spacing(j, i):
    return f"{j} * {i} = {j * i:>2}   "

for i in range(1, 10):
    line = ""
    if e > s:
        for x in range(s, e+1):
            line += line_spacing(x, i)
        print(line)
            
    elif s > e:
        for x in range(s, e-1, -1):
            line += line_spacing(x, i)
        print(line)


        
