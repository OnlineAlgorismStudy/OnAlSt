n = int(input())

for i in range(n,0,-1):
    print(' '* (n-i) + '*'*(2*i-1))


''' OR
for i in range(n,0,-1):
    print(('*'*(2*i-1)).center(2*n))
'''

