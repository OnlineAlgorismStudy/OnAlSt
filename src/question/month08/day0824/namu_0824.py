board = []
for _ in range(5):
    n = [int(x) for x in input().split()[:4]]
    if sum(n) / len(n) >= 80:
        board.append("pass")
    else:
        board.append('fail')
print(*board, sep='\n')
print('Successful :', board.count('pass'))

