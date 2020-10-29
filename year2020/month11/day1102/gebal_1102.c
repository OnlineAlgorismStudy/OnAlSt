#include<stdio.h>
#include<string.h>

int main() {
	char a[101], b[101];
	int len_a, len_b;
	scanf("%s %s", a, b);
	len_a = strlen(a);
	len_b = strlen(b);
	printf("%d", len_a > len_b ? len_a : len_b);
	return 0;
}
