def solution(s):
    string = s.split(' ')
    answer = []
    for x in string:
        answer.append(str.join('', [y.upper() if i % 2 == 0 else y.lower() for i, y in enumerate(x)]))
    return str.join(' ', answer)
