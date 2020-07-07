#include <stdio.h>

int main ()
{
	while (1)
	{
	
	int num;
	printf ("\n1. Korea\n");
	printf ("2. USA\n");
	printf ("3. Japan\n");
	printf ("4. China\n");
	printf ("number? ");
	scanf ("%d", &num);
	
	switch (num)
	{
		case 1 :
			printf ("\nSeoul\n");
			break;
		case 2 :
			printf ("\nWashington\n");
			break;
		case 3 :
			printf ("\nTokyo\n");
			break;
		case 4 :
			printf ("\nBeijing\n");
			break;
		default:
			printf ("\nnone");
			return 0;	
	}

}
}
