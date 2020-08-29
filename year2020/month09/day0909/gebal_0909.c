#include<stdio.h>

void proc(int n) {
	printf("== %ddan ==\n", n);
	for (int i = 1; i < 10; i++) {
		printf("%d * %d = %2d\n", n, i, n * i);
	}
}

int main() {
	int a, b;
	scanf("%d %d", &a, &b);
	if (a > b) {
		a ^= b;
		b ^= a;
		a ^= b;
	}
	for (int i = a; i <= b; i++) {
		proc(i);
	}
}
