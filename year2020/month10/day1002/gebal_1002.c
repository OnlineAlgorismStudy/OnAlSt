#include<stdio.h>

void reculsive(int n) {
	if (n == 0) return;
	printf("%d ", n);
	reculsive(--n);
}

int main() {
	int n;
	scanf("%d", &n);
	reculsive(n);
}
