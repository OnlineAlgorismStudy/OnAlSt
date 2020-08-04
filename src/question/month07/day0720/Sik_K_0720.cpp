#include <stdio.h>
int main ()
{
	int n;
	scanf ("%d", &n);

	if (3<=n<=10)
	{
		char a = 'A';
	for (int i = 0; i<n; i++)
	{
		for (int j = i; j <n; j++)
		{
			printf ("%c",a++);
		}
		printf ("\n");
	}
}
	return 0;
}
