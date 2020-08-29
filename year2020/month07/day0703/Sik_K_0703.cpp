#include <stdio.h>

int main ()
{
	int width, length;
	printf ("width? ");
	scanf ("%d", &width);
	printf ("length? ");
	scanf ("%d", &length);
	
	width += 5;
	length *= 2;
	
	printf ("width = %d\n", width);
	printf ("length = %d\n", length);
	printf ("area = %d\n", width * length);
	
	return 0;
}
