import numpy as np

def solution(a, b):
    answer = np.dot(np.array(a),np.array(b))
    return answer.tolist()
