n = int(input())

max = 2*n-1
for i in range(2*n-1):
    if i < n - 1:
        space = i
    else:
        space = 2*(n-1)-i
    fill = max - 2 * space
    print(' ' * space + '*' * fill)

''' OR
for i in range(n-1,0,-1):
    print(('*' * (2 * i + 1)).center(2 * n))
for i in range(n):
    print(('*' * (2 * i + 1)).center(2 * n))
'''
