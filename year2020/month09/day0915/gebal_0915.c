#include<stdio.h>

void square(int a, int b) {
	if (a > b) printf("%d", a * a - b * b);
	else printf("%d", b * b - a * a);
}

int main() {
	int a, b;
	scanf("%d %d", &a, &b);
	square(a, b);
}
