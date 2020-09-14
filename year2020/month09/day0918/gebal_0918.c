#include<stdio.h>
#include<math.h>

void compare(int type, void *a, void *b) {
	if (type == sizeof(int)) {
		int x = *(int*)a;
		int y = *(int*)b;
		printf("%d\n", abs(x) > abs(y) ? x : y);
	}
	else {
		double x = *(double*)a;
		double y = *(double*)b;
		printf("%0.2lf\n", (fabs(x) > fabs(y) ? y : x));
	}
}

int main() {
	int a, b;
	double ra, rb;
	scanf("%d %d", &a, &b);
	compare(sizeof(a), &a, &b);	
	scanf("%lf %lf", &ra, &rb);
	compare(sizeof(ra), &ra, &rb);
}
