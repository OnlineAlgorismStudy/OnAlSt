lst = [int(x) for x in input().split()]
odd, even = 0, 0
for i in range(len(lst)):
    if i%2 == 1:
        even += lst[i]
    else:
        odd += lst[i]
print(f'odd: {odd}\neven : {even}')
