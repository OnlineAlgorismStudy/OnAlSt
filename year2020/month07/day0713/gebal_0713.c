#include<stdio.h>

int main() {
	int i, j;
	for (i = 2; i < 10; i++) {
		for (j = 1; j < 10; j++) {
			printf("%d * %d = %2d", i, j, i*j);
			printf("   ");
		}
		printf("\n");
	}
  return 0;
}
