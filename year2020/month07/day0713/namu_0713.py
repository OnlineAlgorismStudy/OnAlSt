def make_string(num, i):
    return f"{num} * {i} = {num * i:>2}   "


for i in range(2, 5):
    line = ""
    for j in range(1, 6):
        line += make_string(i, j)
    print(line.strip())
