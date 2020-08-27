s = {0: "first", 1: "second", 2: "third"}

def proc(n):
    print(s[n], "@" * 10, sep="\n")

[proc(x) for x in range(3)]
