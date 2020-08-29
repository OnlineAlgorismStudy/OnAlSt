#include<stdio.h>

int main() {
	int cache[4][3] = { {3,5,9},{2,11,5},{8,30,10},{22,5,1} }, sum = 0;
	for (int i = 0; i < 4; i++) {
		for (int j = 0; j < 3; j++) {
			sum += cache[i][j];
			printf("%d ", cache[i][j]);
		}
		printf("\n");
	}
	printf("%d", sum);
}
