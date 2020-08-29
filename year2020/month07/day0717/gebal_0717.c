#include<stdio.h>

int main() {
	int n, i, j;
	scanf("%d", &n);
	n = 2 * n - 1;
	for (i = 0; i <= n; i++) {
		if (i % 2 == 0) {
			for (j = 0; j < i / 2; j++) {
				printf(" ");
			}
			for (j = n; j > i; j--) {
				printf("*");
			}			
			printf("\n");
		}
	}
}
