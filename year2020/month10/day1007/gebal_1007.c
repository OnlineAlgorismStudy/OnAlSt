#include<stdio.h>
#include<math.h>

int reculsive(int n) {
	if (n == 0) return 0;
	return (int)pow((n % 10), 2) + reculsive(n / 10);
}

int main() {
	int n;
	scanf("%d", &n);
	printf("%d", reculsive(n));
}
