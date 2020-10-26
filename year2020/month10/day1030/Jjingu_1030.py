#Jjingu 1030 solution

mystring = input()
trans = ""
for i in range(len(mystring)):
    if mystring[i].isalpha():
        trans += mystring[i].lower()
    elif mystring[i].isdigit():
        trans += mystring[i]
        
print(trans)
