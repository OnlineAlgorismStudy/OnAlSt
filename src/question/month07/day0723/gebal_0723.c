#include<stdio.h>

int main() {
	int n, N, i, j;
	scanf("%d", &n);
	N = n * 2 - 1;
	for (i = 0; i < (N - (N / 2)); i++) {
		for (j = 0; j < i; j++) {
			printf(" ");
		}
		for (j = 0; j < (n-i)*2-1; j++) {
			printf("*");
		}
		printf("\n");
	}
	for (i = 1; i <= N / 2; i++) {
		for (j = N / 2; j > i; j--) {
			printf(" ");
		}
		for (j = 0; j < 2*i+1; j++) {
			printf("*");
		}
		printf("\n");
	}
}
