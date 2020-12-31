def solution(x):
    number = str(x)
    cache = 0
    for i in range(len(number)):
        cache+= float(number[i])
        
    if x%cache ==0:
        answer = True
    else:
        answer = False
        
    return answer
