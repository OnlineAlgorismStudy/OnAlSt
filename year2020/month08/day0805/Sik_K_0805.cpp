#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main() 
{
	double score[] = { 85.6, 79.5, 83.1, 80.0, 78.2, 75.0 };
	int a, b;
	scanf_s ("%d %d", &a, &b);

	printf ("%.1lf", (score[a - 1] + score[b - 1])/2);
	return 0;

}