#include<stdio.h>
#include<math.h>
int main() {
	int min = 1001, n, i;
	for (i = 0; i < 10; i++) {
		scanf(" %d", &n);
		if (n < min) {
			min = n;
		}
	}
	printf("%d", min);
}
