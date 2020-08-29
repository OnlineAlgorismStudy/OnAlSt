#include<stdio.h>
int main() {
	int n, i, even = 0, odd = 0;
	for (i = 0; i < 10; i++) {
		scanf(" %d", &n);
		if (i % 2 == 0) {
			odd += n;
		}
		else {
			even += n;
		}
	}
	printf("odd : %d\n", odd);
	printf("even: %d\n", even);
}
