#찐구 1123

words = []
for i in range(5):
    word = input()
    words.append(word)
    
def find_word(words, a):
    found = False
    for word in words:
        key = word.find(a)
        if key!=-1:
            print(word)
            found = True
    
    if not found:
        print("none")

repeat = True
while repeat:
    a = input()
    if a == "stop":
        break
    find_word(words,a)
