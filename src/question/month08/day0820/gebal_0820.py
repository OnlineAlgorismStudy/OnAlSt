cache = [[5, 8, 10, 6, 4], [11, 20, 1, 13, 2], [7, 9, 14, 22, 3]]
[[print(str(v).rjust(2), end='\t') if i != 4 else print(str(v).rjust(2)) for i, v in enumerate(j)] for j in cache]
