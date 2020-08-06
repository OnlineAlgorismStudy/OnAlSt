#include <stdio.h>

int main()
{
	int num[100];
	int a = 0;

	while (true)
	{
		scanf_s("%d", &num[a]);
		if (num[a] == 0)
			
			break;
		a++;
	}
	for (int i = a-1; i >= 0; i--)
	{
		printf("%d ", num[i]);
	}

}