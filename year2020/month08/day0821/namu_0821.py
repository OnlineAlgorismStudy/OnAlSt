print('first array')
lst1 = [[int(x) for x in input().split()],
        [int(x) for x in input().split()]]
print('second array')
lst2 = [[int(x) for x in input().split()],
        [int(x) for x in input().split()]]
for i in range(2):
    for x, y in zip(lst1[i], lst2[i]):
        print(x*y, end=' ')
    print()

# 1 2 3 4
# 5 6 7 8
# 1 4 7 8
# 3 6 9 8
