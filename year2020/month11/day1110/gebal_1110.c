#include<stdio.h>
#include<string.h>
#include<stdlib.h>

int main() {
	char a[21], b[21];

	scanf("%s %s", a, b);
	b[0] = a[0];
	b[1] = a[1];
	
	strncat(b, a, 2);
	printf("%s\n", b);
	return 0;
}
