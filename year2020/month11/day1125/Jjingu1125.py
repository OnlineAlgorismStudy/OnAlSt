#찐구 1125

import re

string = input().split(' ')
num_1 = re.findall("\d+",string[0])
num_2 = re.findall("\d+",string[1])

print(int(num_1[0])*int(num_2[0]))
