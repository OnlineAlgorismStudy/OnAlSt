#찐구 1119

repeat = True
words = []
while repeat:
    word = input()
    if word == '0':
        repeat = False
        break
    
    words.append(word)

for i in range(len(words)):
    if i%2 == 0:
        print(words[i])
    
