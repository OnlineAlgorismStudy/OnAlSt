#include<stdio.h>

void proc(int *a, int *b) {
	if (*a > *b) {
		*a /= 2;
		*b *= 2;
	}
	else {
		*a *= 2;
		*b /= 2;
	}
}

int main() {
	int a, b;
	scanf("%d %d", &a, &b);
	proc(&a, &b);
	printf("%d %d", a, b);
}
