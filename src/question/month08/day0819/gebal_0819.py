from collections import Counter
inp = []
while True:
    x = input()
    if 'A' <= x <= 'Z':
        inp.append(x)
    else:
        [print(k, ':', v) for k, v in sorted(Counter(inp).items())]
        break
