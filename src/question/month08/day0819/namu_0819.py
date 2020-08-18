n = input()
d = {}
while n.isupper():
    if n not in d:
        d[n] = 1
    else:
        d[n] += 1
    n = input()
for key in sorted(d):
    print(key, ':', d[key])
