#include <stdio.h>
#define _CRT_SECURE_NO_WARNINGS

int main()
{
	int num[10], b = 0;
	double a = 0;

	for (int i = 1; i <= 10; i++)
	{
		scanf_s ("%d", &num[i]);

		if (i % 2 == 1)
			a += num[i];
		else
			b += num[i];
	}
	printf("sum : %d\n", b);
	printf("avg : %.1f", a / 5);
	return 0;
}