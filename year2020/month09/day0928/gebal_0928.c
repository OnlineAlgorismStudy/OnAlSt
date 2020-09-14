#include<stdio.h>
#include<math.h>

int main() {
	double n, sum = 0, rsum = 0;
	for (int i = 0; i < 3; i++) {
		scanf("%lf", &n);
		rsum += round(n);
		sum += n;
	}
	printf("%d\n%d", (int)round(sum / 3), (int)round(rsum / 3));
}
