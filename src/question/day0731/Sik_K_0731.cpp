#include <stdio.h>

int main()
{
	int a, b;


	while (true)
	{
		scanf_s("%d %d", &a, &b);

		if (a < 2 || a>9 || b < 2 || b>9)
			printf("INPUT ERROR");
		else
			break;
	}
	for (int i = 1; i <= 9; i++)
	{
		if (a < b)
		{
			for (int j = a; j <= b; j++)
			{
				printf("%d * %d = %2d   ", j, i, j * i);
			}
		}
		else
		{
			for (int j = a; j >= b; j--)
			{
				printf("%d * %d = %2d   ", j, i, i * j);
			}
		}
		printf("\n");
	}
	return 0;
}