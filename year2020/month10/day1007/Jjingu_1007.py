
#찐구 1007 문제풀이

def recursive(a):
    if a == 0:
        return 0
    return int((a%10)**2) + recursive(a//10)

a = int(input())
print(recursive(a))
