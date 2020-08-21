#include<stdio.h>

void print(int n) {
	for (int i = 0; i < n; i++) {
		printf("~!@#$^&*()_+|\n");
	}
}

int main() {
	int n;
	scanf("%d", &n);
	print(n);
}
