#include<stdio.h>

void reculsive(int n) {
	if (n == 0) return;
	reculsive(--n);
	printf("recursive\n");
}

int main() {
	int n;
	scanf("%d", &n);
	reculsive(n);
}
