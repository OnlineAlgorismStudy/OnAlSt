#찐구 1127

numbers = list(map(int,input().split(' ')))

def num_possible(numbers):
    numbers.sort()
    num_list = []
    for i in range(len(numbers)):
        for j in range(i+1,len(numbers)):
            num_new = numbers[i]+numbers[j]
            if num_new not in num_list:
                num_list.append(num_new)
              
    num_list.sort()
    
    print(num_list)
    
num_possible(numbers)
