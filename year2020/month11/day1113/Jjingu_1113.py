#찐구 1113 문제풀이

mport re

text = input()
num_list = re.findall(r"[-+]?\b(?<!\d\.)\d+\.\d+\b(?!\.\d)",text)
print(int(float(num_list[0]))*2)
print('%.2F' %float(num[0]))
