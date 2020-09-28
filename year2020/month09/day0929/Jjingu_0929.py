# 찐구 0929 문제풀이

def bubble_sort(arr):
    for i in range(3):
        for j in range(0,len(arr)-1):
            if arr[j] > arr[j + 1]:
               arr[j + 1], arr[j] = arr[j], arr[j+1]
    
    print(*arr)

arr = list(map(int, input().split(' ')))
bubble_sort(arr)
