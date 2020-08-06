#include <stdio.h>

int main()
{	
	int a;
	char c[10];

	for (a = 0; a < 10; a++)
	{
		scanf_s(" %c", &c[a]);
	}
	printf ("%c, %c, %c", c[0], c[3], c[6]);
	return 0;
}
