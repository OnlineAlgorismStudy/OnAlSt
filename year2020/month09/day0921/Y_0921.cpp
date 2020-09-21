#include <iostream>
#include <math.h>
using namespace std;

int main() {
	int arr[10];
	int count = 10;
	for(int i=0; i<count; i++)
	{
		scanf("%d", &arr[i]);	
	}

	for(int i=0; i<count-1; i++)
	{
		for(int j=0; j<count-1; j++)
		{
			if(arr[j] < arr[j+1])
			{
				int temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
			}
		}

		for(int k=0; k<count; k++)
		{
			printf("%d ", arr[k]);
		}
		printf("\n");
	}
	return 0;
}
