#찐구 1120 

n = int(input())
words = []
for i in range(n):
    word = input()
    words.append(word)
    
a = sorted(words)
for i in range(n):
    print(a[i])
