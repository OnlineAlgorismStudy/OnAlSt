#찐구 1116 

text = input().split(' ')

text_re = ''
for num_str in text:
    text_re += num_str
    
for i in range(len(text_re)//3+1):
    if len(text_re)>=3:
        print(text_re[:3])
        text_re = text_re[3:]
    else:
        print(text_re)
    
    
