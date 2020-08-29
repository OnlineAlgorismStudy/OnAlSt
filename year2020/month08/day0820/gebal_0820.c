#include<stdio.h>

int main() {
	int cache[3][5] = { 
		{5, 8, 10, 6, 4},
		{11, 20, 1, 13, 2},
		{7, 9, 14, 22, 3} 
	};
	for (int i = 0; i < 3; i++) {
		for (int j = 0; j < 5; j++) {
			printf("%2d\t", cache[i][j]);
		}
		printf("\n");
	}
}
