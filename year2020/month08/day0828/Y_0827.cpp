#include <iostream>
using namespace std; 

int arr[5][3] = {0};

int main() {
	
	int sum = 0;

	for(int i=0; i<4; i++)
	{
		for(int j=0; j<2; j++)
		{
			scanf("%d", &arr[i][j]);
			sum += arr[i][j];
			
			arr[i][2] += arr[i][j];
			arr[4][j] += arr[i][j];
		}
	}

	for(int i=0; i<4; i++)
	{
		printf("%d ", (arr[i][2])/2);
	}
	printf("\n");

	for(int i=0; i<2; i++)
	{
		printf("%d ", (arr[4][i]/4));
	}
	printf("\n");
	printf("%d\n", sum/8);
}

