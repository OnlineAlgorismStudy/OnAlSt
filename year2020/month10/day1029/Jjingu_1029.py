#찐구 1029 문제풀이

mystring = input()
n = len(mystring)
for i in range(n):
    mystring = mystring[n-1] + mystring[:-1]
    
    print(mystring)
    
