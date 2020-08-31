class Student:
    a = None
    b = None
    c = None

    def __init__(self, a, b, c):
        self.a = a
        self.b = b
        self.c = c

    def __add__(self, other):
        return Student(self.a + other.a, self.b + other.b, self.c + other.c)

    def sum(self):
        return self.a + self.b + self.c

    def all(self):
        return self.a, self.b, self.c


std = []
for _ in range(3):
    a, b, c = map(int, input().split(' '))
    std.append(Student(a, b, c))

_sum = std[0] + std[1] + std[2]
for i in range(3):
    print(*std[i].all(), std[i].sum())
print(*_sum.all(), _sum.sum())
