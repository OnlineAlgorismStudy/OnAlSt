def output(n):
    if n == 0:
        return
    else:
        print("recursive")
        output(n - 1)


n = int(input())
if 0 < n < 20:
    output(n)
