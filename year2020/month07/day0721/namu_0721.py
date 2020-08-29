import string

n = int(input())

list_int = [x for x in range(1, n * (n + 1) // 2 + 1)]
alpha = string.printable[36:]


# p is counter for integer
# z is counter for alphabet
p, z = 0, 0
for i in range(n):
    print(*list_int[p:p + n - i], end=' ')
    print(*alpha[z:z + i + 1])
    p += n - i
    z += i + 1
