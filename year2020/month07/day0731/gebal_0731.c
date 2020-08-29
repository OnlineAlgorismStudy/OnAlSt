#include<stdio.h>

int main() {
	int s, e, i, j;
	scanf("%d %d", &s, &e);
	if (s < 2 || s > 9 || e < 2 || e > 9) {
		printf("INPUT ERROR!");
		return 0;
	}
	if (e > s) {
		e ^= s;
		s ^= e; 
		e ^= s;
	}
		
	for (j = 1; j <= 9; j++) {
		for (i = s; i >= e; i--) {
			printf("%d * %d = %2d   ", i, j, i * j);
		}
		printf("\n");
	}


}
