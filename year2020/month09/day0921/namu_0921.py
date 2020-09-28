def bubble_sort(lst):
    for i in range(10):
        for j in range(9):
            if lst[j] < lst[j + 1]:
                lst[j + 1], lst[j] = lst[j], lst[j + 1]
        print(*lst)


lst = list(map(int, input().split(' ')))
bubble_sort(lst)
