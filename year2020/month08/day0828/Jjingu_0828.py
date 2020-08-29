#아대숲 찐구 0828 풀이

import numpy as np

num_list = []

for i in range(0,4):
    num = input().split(' ')
    num = list(map(int,num))
    num_list.append(num)

np.array(num_list)

a = []
b = []
for i in range(0,4):
   avg = np.mean(num_list[i])
   a.append(num_list[i][0])
   b.append(num_list[i][1])
   print('%d'%avg,end=" ")

print()

a = np.array(a)
b = np.array(b)
tot_avg = (np.sum(a)+np.sum(b))/8
print('%d'%np.mean(a),'%d'%np.mean(b))
print('%d'%tot_avg)
