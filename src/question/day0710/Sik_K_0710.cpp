#include <stdio.h>

int main ()
{
	int n;
	scanf ("%d", &n);
	double sum, avg;
	

	
	if (n <=10)
		for (int i=0; i<n; i++)
		{int  data;
		scanf ("%d", &data);
		sum += data;
		}
		
		avg = sum/n;
		printf ("\navg : %.1f\n", avg);
		if (avg >= 80)
		{
		
			printf ("pass");
		}
			else
		{
			
			printf ("fail");
		}
			return 0;
}
