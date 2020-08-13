#include<stdio.h>
#include<math.h>
int main() {
	int cache[10], i, even = 0, odd = 0;
	for (i = 0; i < 10; i++) {
		scanf(" %d", &cache[i]);
		if (i % 2 == 0) {
			odd += cache[i];
		}
		else {
			even += cache[i];
		}
	}
	printf("sum : %d\n", even);
	printf("avg : %0.1f", floor((double)odd / 5 * 10) / 10);
}
