#Jjingu 1027 Solution

mystring = input()
trans = ""
for i in range(len(mystring)):
    if mystring[i].isalpha():
        trans += mystring[i].upper()
                
print(trans)
