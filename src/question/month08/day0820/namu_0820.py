lst = [[5, 8, 10, 6, 4], [11, 20, 1, 13, 2], [7, 9, 14, 22, 3]]
for i in lst:
    s = ''
    for j in i:
        s += str(j).rjust(4)
    print(s)
