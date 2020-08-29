lst = [int(x) for x in input().split()]
sum1, sum2 = 0, 0
for i in range(len(lst)):
    if i % 2 == 1:
        sum1 += lst[i]
    else:
        sum2 += lst[i]
print('sum : ', sum1)
print('avg : ', round(sum2 / 5, 1))
