#include<stdio.h>

void reculsive(int n) {
	if (n > 2) reculsive(n - 2);
	printf("%d ", n);
	
}

int main() {
	int n;
	scanf("%d", &n);
	reculsive(n);
}
