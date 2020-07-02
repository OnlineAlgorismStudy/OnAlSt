#include <stdio.h>
#define YD 91.44

int main()
{
	double yard;
    printf ("yard? ");
    scanf ("%lf", &yard); 
    printf ("%.1fyard = %.1fcm\n", yard, yard * YD);
 
	return 0; 
}
