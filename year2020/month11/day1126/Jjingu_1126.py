#찐구 1126

mystrings = input().split(' ')
int_num = str(int(mystrings[0]))
real_num = str(round(float(mystrings[1]),3))
word = mystrings[2]

re_string = int_num+real_num+word
print(re_string[:int((len(re_string)+1)/2)])
print(re_string[int((len(re_string)+1)/2):])
