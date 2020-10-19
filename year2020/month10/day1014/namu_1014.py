def recur(n, i):
    if n > 1:
        return recur(n // (2 + n % 2), i+1)
    else:
        return i


print(recur(int(input()),0))
