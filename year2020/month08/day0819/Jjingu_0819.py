#아대숲 찐구 0819 문제풀이

import collections

ret = True
alpha_list = []
while ret:
    a = input()
    if a.isupper():
       alpha_list.append(a)
    else: 
        break

alpha_list = sorted(alpha_list)

counter = collections.Counter(alpha_list)
items = counter.items()

for k,v in items:
    print(k,":",v)
