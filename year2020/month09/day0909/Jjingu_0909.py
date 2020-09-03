#찐구 0909 문제풀이

class Table_mul():
    def table_print(self, a):
        print(f"== {a}dan ==")
        for i in range(1,10):
            print(f"{a} * {i} = {a*i}")
            
    def gen_table(self, n):
        for i in range(min(n),max(n)+1):
            self.table_print(i)
            print()

num = list(map(int, input().split(' ')))
Table_mul().gen_table(num)
