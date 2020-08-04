#include <stdio.h>

int main()
{
	int n;
	scanf_s("%d", &n);

	for (int i = 0; i < n; i++)
	{
		for (int j = 2*(n-1); j > i*2; j--)
		{
			printf(" ");
		}
		for (int k = 0; k <= i * 2; k++)
		{
			printf("*");
		}
		printf("\n");
	}
	return 0;
}