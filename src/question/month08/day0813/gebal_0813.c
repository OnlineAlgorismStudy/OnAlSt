#include<stdio.h>
int main() {
	int n, max = -1000, min = 1000;
	while (1)
	{
		scanf("%d", &n);
		if (n == 999) break;
		if (n > max) max = n;
		else if (n < min) min = n;
	}

	printf("max : %d\n", max);
	printf("min: %d", min);
}
