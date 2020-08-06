#include<stdio.h>

int main() {
	int n, i, j, alph = 0, num = 1;
	scanf("%d", &n);
	for (i = 0; i < n; i++) {
		for (j = n; j > i; j--) {
			printf("%d ", num++);
		}
		for (j = 0; j < i + 1; j++) {
			printf("%c ", alph + 'A');
			alph++;
		}
		printf("\n");
	}
}
