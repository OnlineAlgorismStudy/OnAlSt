#include <stdio.h>

int main()
{
	int n, num = 0, di = 0, sp = 0;
	scanf_s("%d", &n);

	for (int i = 1; i <= n*2 - 1; i++)
	{
		if (i > 0 && i <= n)
			num++;
		else
			num--;
		for (int k = 0; k < sp*2; k++)
		{
			printf(" ");
		}
		for (int j = 1; j <= num; j++)
		{
			printf("# ");
		}
		if (i >= n)
			sp++;
		
		printf("\n");
	
	}
	return 0;
}