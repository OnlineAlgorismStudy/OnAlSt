def solution(a, b):
    day = ["FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"]
    date = [0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]
    return day[((sum(date[:a]) + b) % 7) - 1]
