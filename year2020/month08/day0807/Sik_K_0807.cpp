#include <stdio.h>

int main()
{
	int num[10], min = 10000, max = 0, a = 0;
	

	for (int i = 0; i < 10; i++)
	{
		scanf_s("%d", &num[a]);

		if (num[a] > 0 && num[a] < 100)
		{
			if (num[a] > max)
				max = num[a];
		}
		if (num[a] > 100 && num[a] < 10000)
		{
			if (num[a] < min)
				min = num[a];

		}

	}

	printf("%d, %d", max, min);

	return 0;
}