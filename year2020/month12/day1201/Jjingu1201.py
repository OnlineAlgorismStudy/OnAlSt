찐구 1201

def recursive(n):
    q, r = divmod(n, 3)
    now = str(r)
    return recursive(q)+now if q else now

def solution(n):
    answer = 0
    tri_sol = recursive(n)
    tri_rev = tri_sol[::-1]
    for i in range(len(str(int(tri_rev)))):
        answer+=int(tri_sol[i])*(3**i)
        
    return answer

print(solution(125))
