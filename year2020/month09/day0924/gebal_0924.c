#include<stdio.h>
#include<math.h>

int main() {
	int n, sum = 0;
	for (int i = 0; i < 5; i++) {
		scanf(" %d", &n);
		sum += abs(n);
	}
	printf("%d", sum);
}
