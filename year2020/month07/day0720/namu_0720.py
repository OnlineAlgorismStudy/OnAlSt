import string


n = int(input())
while not (3 <= n <= 10):
    n = int(input('must be 3 <= n <= 10: '))

alpha = string.printable[36:]
k = 0
for i in range(n, 0, -1):
    print(alpha[k:k + i])
    k += i

