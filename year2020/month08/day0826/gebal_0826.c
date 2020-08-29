#include<stdio.h>

int main() {
	int cache[4][3] = { 0 }, sum;
	for (int i = 0; i < 4; i++) {
		printf("%dclass? ", i + 1);
		for (int j = 0; j < 3; j++) {
			scanf(" %d", &cache[i][j]);
		}
	}
	for (int i = 0; i < 4; i++) {
		sum = 0;
		for (int j = 0; j < 3; j++) {
			sum += cache[i][j];
		}
		printf("%dclass : %d\n", i + 1, sum);
	}
}
