#찐구 1019 문제풀이

repeat = True
while repeat:
    n = int(input("ASCII code = ?"))
    if 33<=n and n<=127:
        print(chr(n))
    else:
        repeat = False
