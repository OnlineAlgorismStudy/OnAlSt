#include<stdio.h>

int main() {
	int n, i, j, number = 1;
	scanf("%d", &n);
	for (i = 0; i < n; i++) {
		for (j = 0; j < i + 1; j++) {
			printf("# ");
		}
		printf("\n");
	}
	for (i = 1; i < n; i++) {
		for (j = 0; j < i*2; j++) {
			printf(" ");
		}
		for (j = n; j > i; j--) {
			printf("# ");
		}
		printf("\n");
	}
}
