def compare(t):
    a, b = list(map(t, input().split(' ')))
    is_true = abs(a) > abs(b)
    is_true = not is_true if t == float else is_true
    return a if is_true else b

print(compare(int))
print(compare(float))
