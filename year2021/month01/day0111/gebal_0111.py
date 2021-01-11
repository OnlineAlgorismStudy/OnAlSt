def solution(prices):
    stack = []
    n = len(prices)
    answer = [0] * n

    for i in range(n):
        while stack and prices[stack[-1]] > prices[i]:
            tmp = stack.pop()
            answer[tmp] = i - tmp
        stack.append(i)

    for x in stack:
        answer[x] = n - x - 1
    return answer
