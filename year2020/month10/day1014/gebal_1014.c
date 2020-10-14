#include<stdio.h>

int cnt = 0;

void reculsive(int n) {
	if (n == 1) {
		printf("%d", cnt);
		return;
	}
	cnt++;
	if (n % 2 == 0) reculsive(n / 2);
	else reculsive(n / 3);
}

int main() {
	int n;
	scanf("%d", &n);
	reculsive(n);
}
