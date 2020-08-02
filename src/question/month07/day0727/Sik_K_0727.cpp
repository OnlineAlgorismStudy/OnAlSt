#include <stdio.h>

int main()
{
	int n;
	int num = 1;
	scanf_s ("%d", &n);

	for (int i = 1; i <= n; i++)
	{
		for (int j = 1; j <= (n - i)*2; j++)
		{
			printf(" ");
		}
		for (int k = 1; k <= i; k++)
		{
			printf("%d ", num++);
		}
		num = 1;
		printf("\n");
	}
	return 0;
}