n = int(input())
arr = []
c = 0
while n != 0 and c < 100:
    if n % 5 == 0:
        arr.append(n)
    n = int(input())
    c += 1
print(f'Multiples of 5: {len(arr)}')
print(f'sum : {sum(arr)}')
print(f'avg : {sum(arr) / len(arr)}')
