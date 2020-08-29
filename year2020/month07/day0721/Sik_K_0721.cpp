#include <stdio.h>
int main ()
{
	int n;
	scanf ("%d", &n);
	char a = 'A';
	int b =1;
	for (int i = 1; i<=n; i++)
	{
		for (int j = 1; j <=n+1; j++)
		{
			if (j<= n-i+1)
			{
			printf ("%d",b++);
		}
		else
		{
			printf("%c", a++);
		}
		
	}printf ("\n");
	}

	return 0;
}
