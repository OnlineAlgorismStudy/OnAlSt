#include<stdio.h>

int _sum(int n) {
	return (n * (1 + n)) / 2;
}

int main() {
	int n;
	scanf("%d", &n);
	printf("%d", _sum(n));
}
