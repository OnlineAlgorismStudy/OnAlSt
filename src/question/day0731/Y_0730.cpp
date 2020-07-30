#define _CRT_SECURE_NO_WARNINGS
#include <iostream>
using namespace std;

int main() {
	int s, e;
	scanf("%d %d", &s, &e);

	if(s<2 || e<2 || s>9 || e>9)
		return 0;

	for(int i=1; i<=9; i++)
	{
		if(s<e)
		{
			for(int j=s; j<=e; j++)
			{
				printf("%d * %d = %2d   ", j, i, j * i);
			}
		}
		else
		{
			for(int j=s; j>=e; j--)
			{
				printf("%d * %d = %2d   ", j, i, j * i);
			}
		}
		printf("\n");
	}
}
