#include<stdio.h>
#include<string.h>

int main() {
	char a[20], b[20];
	scanf("%s", a);
	scanf("%s", b);
	printf("%d", strlen(a) + strlen(b));
}
