#include<stdio.h>

int main() {
	int i;
	char c[10];
	for (i = 0; i < 10; i++) {
		scanf(" %c", &c[i]);
	}
	printf("%c %c %c", c[0], c[3], c[6]);
}
