#include<stdio.h>
#include<math.h>
#define pie 3.14

void print(int r) {
	printf("%0.2lf", floor(r * r * pie * 100) / 100);
}

int main() {
	int r;
	scanf("%d", &r);
	print(r);
}
