# Insertion Sort
'''
Insertion Sort (Stable)  
O(T) = O(n^2)

'''
def insertionSort(arr):
    for i in range(1, len(arr)):
        j = i-1
        while (j >=0 and arr[j+1]<arr[j]):
            arr[j+1], arr[j] = arr[j], arr[j+1]
            j-=1
    return arr
array = [3,2,1,4,5]
arr = [9,10,6,7,4,1,2]
print(insertionSort(array))
print(insertionSort(arr))
