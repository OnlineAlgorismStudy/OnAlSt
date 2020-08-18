s = [0 for x in range(11)]
while True:
    inp = int(input())
    if inp == 0:
        break
    s[int(inp / 10)] += 1
[print(i * 10 if i != 0 else 1, " : ", s[i], "person") if s[i] != 0 else None for i in range(10, 0, -1)]
