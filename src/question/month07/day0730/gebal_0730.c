#include<stdio.h>

int main() {
	int n, i, j, number = 1;
	scanf("%d", &n);
	for (i = 0; i < n; i++) {
		for (j = 1; j <= n; j++) {
			printf("%d ", number);
			number = (number + 2) % 10;
		}
		printf("\n");
	}
}
