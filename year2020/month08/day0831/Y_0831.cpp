#include <iostream>
using namespace std; 

int main() {
	int arr[3][5];
	
	for(int i=0; i<3; i++)
	{
		for(int j=0; j<5; j++)
		{
			scanf(" %c", &arr[i][j]);
		}
	}
	
	for(int i=0; i<3; i++)
	{
		for(int j=0; j<5; j++)
		{
			printf("%c ", arr[i][j] + 32);
		}
		printf("\n");
	}
}

