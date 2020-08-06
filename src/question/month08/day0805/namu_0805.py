score = [85.6, 79.5, 83.1, 80.0, 78.2, 75.0]
num1, num2 = map(int, input().split())
avg = round((score[num1-1] + score[num2-1]),1)
print(avg)
