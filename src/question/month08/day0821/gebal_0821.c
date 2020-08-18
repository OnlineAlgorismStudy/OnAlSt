#include<stdio.h>

int main() {
	int first[2][4] = {
		{1, 2, 3, 4},
		{5, 6, 7, 8}
	};
	int second[2][4] = {
		{1, 4, 7, 8},
		{3, 6, 9, 8}
	};
	for (int i = 0; i < 2; i++) {
		for (int j = 0; j < 4; j++) {
			printf("%d ", first[i][j] * second[i][j]);
		}
		printf("\n");
	}
}
