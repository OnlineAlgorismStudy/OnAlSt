
# 찐구 0921 문제풀이

def bubble_sort(arr):
    for i in range(0,len(arr)-1):
        for j in range(len(arr)-1):
            if arr[j] < arr[j + 1]:
               arr[j + 1], arr[j] = arr[j], arr[j+1]
        print(*arr)

arr = list(map(int, input().split(' ')))
bubble_sort(arr)
