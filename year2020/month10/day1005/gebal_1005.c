#include<stdio.h>

int reculsive(int n) {
	if (n == 1) return 1;
	return n + reculsive(n-1);
}

int main() {
	int n;
	scanf("%d", &n);
	printf("%d", reculsive(n));
}
