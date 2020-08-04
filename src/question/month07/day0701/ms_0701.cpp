#include <stdio.h>

#define YD 91.44
#define IN 2.54

int main() {
	float x = 2.1f, y = 10.5f;

	printf("%4.1fyd = %.1fcm\n", x, (2.1 * YD));
	printf("%.1fin = %5.1fcm\n", y, (10.5 * IN));

	return 0;
}