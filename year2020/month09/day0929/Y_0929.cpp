#define _CRT_SECURE_NO_WARNINGS
#include <iostream>
#include <cmath>
#define size 7
using namespace std;

int main()
{
    int arr[7];
    for(int i=0; i<size; i++)
    {
        scanf("%d", &arr[i]);
    }
    
    for(int i=0; i<3; i++)
    {
        for(int j=0; j<size-1; j++)
        {
            if(arr[j] > arr[j+1])
            {
                int temp = arr[j+1];
                arr[j+1] = arr[j];
                arr[j] = temp;
            }
        }
    }
    
    for(int i=0; i<size; i++)
    {
        printf("%d ", arr[i]);
    }
    printf("\n");
}
