l = list(map(float, input().split()))
print(round((sum(l)/3)))
print(round(sum([round(x) for x in l])/3))

