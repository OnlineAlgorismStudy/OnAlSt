#include<stdio.h>
#include<math.h>
int main() {
	double cache[7] = { 0, 85.6, 79.5, 83.1, 80.0, 78.2, 75.0 };
	int a, b;
	scanf("%d %d", &a, &b);
	printf("%.1lf", floor((cache[a] + cache[b]) * 100) / 100);
}
