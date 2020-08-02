#include <stdio.h>

int main ()
{	
	int base, height;
	char A;
	do
	{
	printf("Base = ");
	scanf("%d", & base);
	printf("Height = ");
	scanf("%d", &height);
	printf("Triangle width = %.1f\n", (double)base*height/2);
	printf ("Continue? ");
	scanf (" %c", &A);
}
	while (A == 'Y' || A == 'y');
return 0;
}

