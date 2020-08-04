#include <stdio.h>
int main()
{
	int n, num = 1; 
	scanf_s("%d", &n);

	for (int i = 0; i < n; i++)
	{
		for (int j = 0; j < n; j++)
		{
			printf("%d ", num % 10);
			num += 2;
		}
		printf("\n");
	}
	return 0;
}