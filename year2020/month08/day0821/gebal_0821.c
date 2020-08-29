#include<stdio.h>

int main() {
	int cache[2][2][4], num;
	for (int n = 0; n < 2; n++) {
		if (n == 0) printf("first array\n");
		else printf("second array\n");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 4; j++) {
				scanf(" %d", &num);
				cache[n][i][j] = num;
			}
		}
	}
	for (int i = 0; i < 2; i++) {
		for (int j = 0; j < 4; j++) {
			printf("%d ", cache[0][i][j] * cache[1][i][j]);
		}
		printf("\n");
	}
}
