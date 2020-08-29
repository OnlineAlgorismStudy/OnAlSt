#include<stdio.h>
#define max(a,b,c) a > b ? (a > c ? a : c ) : (b > c ? b : c)


int main() {
	int a, b, c;
	scanf("%d %d %d", &a, &b, &c);
	printf("%d", max(a, b, c));
}
