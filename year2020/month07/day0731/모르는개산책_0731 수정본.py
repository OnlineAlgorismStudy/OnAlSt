# 2020 07 31 Algorithm Study Day 27
# Inji Seo

'''
원하는 구구단의 범위를 입력받아 해당 구간의 구구단을 출력하는 프로그램을 작성하시오.

<처리조건>
(1) 구간의 처음과 끝을 입력받는다.
(2) 입력된 구간은 반드시 처음 입력 값이 끝의 입력 값보다 작아야 하는 것은 아니다.
즉 입력된 구간의 범위는 증가하거나 감소하는 순서 그대로 출력되어야 한다.

입력형식: 구구단의 시작 범위 s,와 끝 범위 e를 입력받는다.(s와 e는 2부터 9사이의 정수)
하나의 결과가 출력되면 프로그램을 종료한다.

출력형식: 시작 범위와 끝 범위사이의 구구단을 출력하되 모든 값과 부호 사이는 공백으로 구분하여 아래 출력 예와 같이 줄을 맞추어 출력해야 한다.
구구단 사이는 3개의 공백으로 구분한다.
데이터의 크기가 주어진 범위를 벗어날 경우는 "INPUT ERROR!"를 출력하여 s와 e를 다시 입력받는다.

입력 예: 4 3
출력 예:
4 * 1 =  4   3 * 1 =  3
4 * 2 =  8   3 * 2 =  6
4 * 3 = 12   3 * 3 =  9
4 * 4 = 16   3 * 4 = 12
4 * 5 = 20   3 * 5 = 15
4 * 6 = 24   3 * 6 = 18
4 * 7 = 28   3 * 7 = 21
4 * 8 = 32   3 * 8 = 24
4 * 9 = 36   3 * 9 = 27
'''

s,e = input('').split( )

multiplier = 1

def is_int(s,e):
    try:
        int(s) and int(e)
        return True
    except ValueError:
        return False

while is_int(s,e) is False:
    s,e = input('').split( )
    is_int(s,e)

s = int(s)
e = int(e)

s_ = s

if s > 9 or e > 9 or s < 2 or e < 2:
    print('INPUT ERROR!')

else:
    while multiplier <= 9:
        if s == e:
            if s*multiplier < 10:
                print(s,'*',multiplier,'= ',s*multiplier)
                multiplier += 1
            else:
                print(s,'*',multiplier,'=',s*multiplier)
                multiplier += 1
        elif s_ < e:
            while s_ <= e and multiplier <= 9:
                if s_*multiplier < 10 and s_ != e:
                    print(s_,'*',multiplier,'= ',s_*multiplier,end='   ')
                    s_ += 1
                elif s_*multiplier < 10 and s_ == e:
                    print(s_,'*',multiplier,'= ',s_*multiplier)
                    s_ = s
                    multiplier += 1
                elif s_*multiplier >= 10 and s_ != e:
                    print(s_,'*',multiplier,'=',s_*multiplier,end='   ')
                    s_ += 1                    
                elif s_*multiplier >= 10 and s_ == e:
                    print(s_,'*',multiplier,'=',s_*multiplier)
                    s_ = s
                    multiplier += 1
        else:
            while s_ >= e and multiplier <= 9:
                if s_*multiplier < 10 and s_ != e:
                    print(s_,'*',multiplier,'= ',s_*multiplier,end='   ')
                    s_ -= 1
                elif s_*multiplier < 10 and s_ == e:
                    print(s_,'*',multiplier,'= ',s_*multiplier)
                    s_ = s
                    multiplier += 1
                elif s_*multiplier >= 10 and s_ != e:
                    print(s_,'*',multiplier,'=',s_*multiplier,end='   ')
                    s_ -= 1                    
                elif s_*multiplier >= 10 and s_ == e:
                    print(s_,'*',multiplier,'=',s_*multiplier)
                    s_ = s
                    multiplier += 1 

'''
else:
    while multiplier <= 9:
        if s_ == e:
            if s_*multiplier < 10:
                print(s_, '*', multiplier, '= ', s_*multiplier)
                multiplier += 1
            else:
                print(s_, '*', multiplier, '=', s_*multiplier)
                multiplier += 1
        elif s_ > e:
            while s_ > e and multiplier <= 9:
                if s_ != e:
                    if s_*multiplier < 10:
                        print(s_, '*', multiplier, '= ', s_*multiplier, end='   ')
                        s_ -= 1
                    else:
                        print(s_, '*', multiplier, '=', s_*multiplier, end='   ')
                        s_ -= 1
                elif s_ == e:
                    if s_*multiplier < 10:
                        print(s_, '*', multiplier, '= ', s_*multiplier)
                        s_ = s
                        multiplier += 1
                    else:
                        print(s_, '*', multiplier, '=', s_*multiplier)
                        s_ = s
                        multiplier += 1
        else:
            while s < e and multiplier <= 9:
                if s != e:
                    if s*multiplier < 10:
                        print(s, '*', multiplier, '= ', s*multiplier, end='   ')
                        s += 1
                    else:
                        print(s, '*', multiplier, '=', s*multiplier, end='   ')
                        s += 1
                elif s == e:
                    if s*multiplier < 10:
                        print(s, '*', multiplier, '= ', s*multiplier)
                        s = s_
                        multiplier += 1
                    else:
                        print(s, '*', multiplier, '=', s*multiplier)
                        s = s_
                        multiplier += 1
'''
