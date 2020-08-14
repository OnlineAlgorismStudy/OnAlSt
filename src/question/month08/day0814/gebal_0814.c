#include<stdio.h>
int main() {
	int n, sum = 0, cnt = 0;
	for (int i = 0; i < 100; i++) {
		scanf(" %d", &n);
		if (n == 0) break;
		if (n % 5 == 0) {
			cnt++;
			sum += n;
		}
	}
	printf("Multiples of 5 : %d\n", cnt);
	printf("sum : %d\n", sum);
	printf("avg : %0.1f\n", ((double)sum / (double)cnt));
}
