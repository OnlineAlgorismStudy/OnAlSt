#찐구 1111 문제풀이

mystring = input()
judge = []
if "c" in mystring:
    judge.append("Yes")
else:
    judge.append("No")
    
if "ab" in mystring:
    judge.append("Yes")
else:
    judge.append("No")
    
print(*judge)
