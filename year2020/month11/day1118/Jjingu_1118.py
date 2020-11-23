#찐구 1118 문제풀이

words = ["flower", "rose", "lily", "daffodil", "azalea"]
target = input()
count = 0
for word in words:
    if word[1] == target:
        print(word)
        count+=1

for word in words:
    if word[2] == target:
        print(word)
        count+=1
        
print(count)
    
