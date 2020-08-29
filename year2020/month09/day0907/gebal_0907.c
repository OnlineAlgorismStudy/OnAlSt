#include<stdio.h>
#include<math.h>

void _pow() {
	double a, b;
	scanf("%lf %lf", &a, &b);
	printf("%0.0lf", pow(a, b));
}

int main() {
	_pow();
}
