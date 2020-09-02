
# 아대숲 찐구 0904 문제풀이

def show_max(a,b,c):
    arr = [a, b, c]
    max_num = max(arr)
    return max_num

a, b, c = input().split()
a, b, c = int(a), int(b), int(c)
max_num = show_max(a, b, c)
print(max_num)
