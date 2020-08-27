#include<stdio.h>

void square(int n) {
	int num = 1;
	for (int i = 0; i < n; i++) {
		for (int j = 0; j < n; j++) {
			printf("%d ", num++);
		}
		printf("\n");
	}
}

int main() {
	int n;
	scanf("%d", &n);
	square(n);
}
