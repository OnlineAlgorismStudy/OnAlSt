#include<stdio.h>

int main() {
	int n;
	while (1) {
		printf("ASCII code = ? ");
		scanf("%d", &n);
		if (n < 33 || n > 127) break;
		printf("%c\n", n);
	}

	return 0;
}
