#include<stdio.h>

int main() {
	int n, i, j, cnt = 0;
	scanf("%d", &n);
	for (i = n; i > 0; i--) {
		for (j = 0; j < i; j++) {
			printf("%c", cnt + 'A');
			cnt++;
		}
		printf("\n");
	}
}
