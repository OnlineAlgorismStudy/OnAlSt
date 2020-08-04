n = int(input())
x = 1
for i in range(n):
    for j in range(n):
        if x > 10:
            x = 1
        print(x, end="")
        x += 2
    print("")