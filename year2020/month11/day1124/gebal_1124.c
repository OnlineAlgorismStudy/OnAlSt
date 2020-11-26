#include<stdio.h>
#include<string.h>
#include<stdlib.h>

int main() {
	char a[101], b[101];
	int n;

	scanf("%s %s %d", a, b, &n);
	strcat(a, b);
	strncpy(b, a, n);
	printf("%s\n", a);
	printf("%s\n", b);
	return 0;
	
}
