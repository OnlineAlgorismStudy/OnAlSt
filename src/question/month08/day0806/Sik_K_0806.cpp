#include <stdio.h>

int main() 
{
	int num[10], max = 1000, a = 0;

	while (a < 10)
	{
		scanf_s("%d", &num[a]);

		if (num[a] > 1000)
			continue;

		a++;
	}

	for (int a = 0; a < 10; a++) 
	{
		if (num[a] < max)
			max = num[a];
	}

	printf("%d", max);

	return 0;
}