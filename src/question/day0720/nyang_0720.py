list =["A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T","U", "V", "W", "X", "Y", "Z"]
n = int(input())

if (3 <= n <= 10):
    for i in range(n,0,-1):
        print("")
        for x in range(0,i):
            print(list[0], end='')
            list.pop(0)
    
