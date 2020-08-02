#include <stdio.h>

int main()
{
	int n;
	scanf_s("%d", &n);
	int num = 1;

	for (int i = 0; i < n; i++)
	{
		for (int j = 0; j < i*2; j++)
		{
			printf(" ");
		}
		for (int k = 1; k <= n - i; k++)
		{
			printf("%d ", num++);
		}
		printf("\n");
	}
	return 0;
}