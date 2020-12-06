def solution(s):
    words = s.split(' ')
    answer = ''
    for i in range(len(words)):
        if i !=0:
            reword = ' '
        else:
            reword = ''
            
        for j in range(len(words[i])):
            if j%2==0:
                reword += words[i][j].upper()
            else:
                reword += words[i][j].lower()
            
        answer+=reword
    
    return answer
