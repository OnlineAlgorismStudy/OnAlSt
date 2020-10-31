#찐구 1104 문제풀이

mystring = list(input().split(" "))
for i in range(len(mystring)):
    word_temp = str(i+1)+". "+mystring[i]
    print(word_temp)
