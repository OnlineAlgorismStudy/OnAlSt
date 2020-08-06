#include<stdio.h>
#include<math.h>


int main() {
	char c = 'Y';
	double b, h;
	while (c == 'Y') {
		printf("Base = ");
		scanf("%lf", &b);
		printf("Height = ");
		scanf("%lf", &h);
		printf("Triangle width = %0.1lf\n", floor(b*h / 2 * 100) / 100);
		printf("Continue? ");
		scanf(" %c", &c);
	}
	return 0;

}
