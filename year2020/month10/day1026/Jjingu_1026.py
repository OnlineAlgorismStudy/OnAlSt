 #찐구 1026 문제풀이

repeat = True
while repeat:
    mystring = input()
    if mystring.isalpha():
        print(mystring)
    elif mystring.isdigit():
        print(chr(int(mystring)))
    else:
        break
 
