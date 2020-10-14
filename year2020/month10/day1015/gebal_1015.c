#include<stdio.h>

void calc(int n) {
	int tmp = 1;
	while (n > 0) {
		tmp *= (n % 10) > 0 ? n % 10 : 1;
		n /= 10;
	}
	printf("%d", tmp);
}

int main() {
	int a, b, c;
	scanf("%d %d %d", &a, &b, &c);
	calc(a * b * c);
}
