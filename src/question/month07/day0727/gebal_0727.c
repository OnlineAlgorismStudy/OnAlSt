#include<stdio.h>

int main() {
	int n, i, j;
	scanf("%d", &n);
	for (i = 0; i < n; i++) {
		for (j = n; j > i+1; j--) {
			printf(" ");
		}
		for (j = 1; j < i+2; j++) {
			printf("%d", j);
		}
		printf("\n");
	}
}
