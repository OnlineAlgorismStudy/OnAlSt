#include<stdio.h>

int calc(int n) {
	int mul = n % 10 > 0 ? n % 10 : 1;
	if (n > 0) return mul * calc(n / 10);
	else return mul;
}

int main() {
	int a, b, c;
	scanf("%d %d %d", &a, &b, &c);
	printf("%d", calc(a * b * c));
}
