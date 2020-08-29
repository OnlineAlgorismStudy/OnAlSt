#define _CRT_SECURE_NO_WARNINGS
#include <iostream>
using namespace std; 

int school[4][3];

void input(int cls) {
	printf("%dclass? ", cls+1);

	for(int i=0; i<3; i++)
	{
		scanf("%d", &school[cls-1][i]);
	}
}

int main() {
	for(int i=0; i<4; i++)
	{
		input(i);
	}
	for(int i=0; i<4; i++)
	{
		int sum = 0;
		for(int j=0; j<3; j++)
		{
			sum += school[i-1][j];
		}
		printf("%dclass : %d\n", i+1, sum);
	}
}

