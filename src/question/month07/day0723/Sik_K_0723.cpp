#include <stdio.h>
int main()
{
	int n;
	scanf_s("%d", &n);

	for (int i = 0; i < n; i++)
	{
		for (int j = 1; j <= i; j++)
		{
			printf(" ");
		}
		for (int k = (n*2-1); k > i * 2; k--)
		{
			printf("*");

		}
		printf("\n");
	}
	for (int i = 1; i < n ; i++)
		{
			for (int j = n-1 ; j > i; j--)
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