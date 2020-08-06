#include<stdio.h>
#include<math.h>


int main() {
	int n, i;
	double score, avg, sum = 0;
	scanf("%d", &n);
	for (i = 0; i < n; i++) {
		scanf("%lf", &score);
		sum += score;
	}
	avg = sum / n;
	printf("avg : %0.1lf\n", floor(avg * 100) / 100);
	if (avg < 80) {
		puts("fail");
	}
	else {
		puts("pass");
	}
	return 0;
}
