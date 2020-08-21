#include<stdio.h>

int main() {
	int cache[4][2], hsum[4] = { 0 }, vsum[2] = { 0 }, sum = 0;
	for (int i = 0; i < 4; i++) {
		for (int j = 0; j < 2; j++) {
			scanf(" %d", &cache[i][j]);
			vsum[j] += cache[i][j];
			hsum[i] += cache[i][j];
			sum += cache[i][j];
		}
	}
	for (int i = 0; i < 4; i++) {
		printf("%d ", hsum[i] / 2);
	}
	printf("\n");
	for (int i = 0; i < 2; i++) {
		printf("%d ", vsum[i] / 4);
	}
	printf("\n%d", sum / 8);
}
