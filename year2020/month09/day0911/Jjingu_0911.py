#찐구 0911 문제풀이

def gauss_sum(a):
    num = []
    for i in range(1,a+1):
        num.append(i)
                
    tot_sum = sum(num)
    return tot_sum
    
a = int(input())
tot = gauss_sum(a)
print(tot)
