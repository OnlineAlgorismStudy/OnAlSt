#include<stdio.h>

int reculsive(int n) {
	if (n == 1) return 1;
	else if (n == 2) return 2;
	return reculsive(n - 1) * reculsive(n - 2) % 100;
}

int main() {
	int n;
	scanf("%d", &n);
	printf("%d", reculsive(n));
}
