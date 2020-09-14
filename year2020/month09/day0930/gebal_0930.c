#include<stdio.h>
#include<math.h>
#define PIE 3.141592

int main() {
	double r;
	printf("radius : ");
	scanf("%lf", &r);
	printf("area = %0.3f", round(r*r*PIE * 1000) / 1000);
}
