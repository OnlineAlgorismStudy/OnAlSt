#define _CRT_SECURE_NO_WARNINGS
#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main() {
	int array1[2][4];
	int array2[2][4];

	printf("first array\n");
	for(int i=0; i<2; i++)
		for(int j=0; j<4; j++)
			scanf("%d", &array1[i][j]);

	printf("second array\n");
	for(int i=0; i<2; i++)
		for(int j=0; j<4; j++)
			scanf("%d", &array2[i][j]);

	for(int i=0; i<2; i++) 
	{
		for(int j=0; j<4; j++) 
		{
			printf("%d ", array1[i][j] * array2[i][j]);
		}
		printf("\n");
	}
}
