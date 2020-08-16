n = int(input())
arr = []
while n < 21:
    arr = [int(x) for x in input().split()]
    if len(arr) == n:
        break

for i in sorted(arr, reverse=True):
    print(i)
