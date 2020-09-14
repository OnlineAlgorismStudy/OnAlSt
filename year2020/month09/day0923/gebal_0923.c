#include<stdio.h>
#include<math.h>

int main() {
	double a, b;
	scanf("%lf %lf", &a, &b);
	printf("%d", abs((int)sqrt(a) - (int)sqrt(b)));
}
