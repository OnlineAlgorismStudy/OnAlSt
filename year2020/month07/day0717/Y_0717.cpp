#define _CRT_SECURE_NO_WARNINGS
#include <iostream>
using namespace std;

int main() {
	int n;
	scanf("%d", &n);

	for(int i=0; i<n; i++)
	{
		for(int j=0; j<i; j++)
			printf(" ");

		for(int k=0; k<((n-i)*2-1); k++)
			printf("*");

		printf("\n");
	}
}
