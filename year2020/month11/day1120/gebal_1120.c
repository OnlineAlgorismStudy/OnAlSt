#include<stdio.h>
#include<string.h>
#include<stdlib.h>

int main() {
	int n;
	char buf[10][101];
	scanf("%d", &n);
	for (int i = 0; i < n; i++) {
		scanf("%s", buf[i]);
	}
	qsort(buf, n, 101, strcmp);
	for (int i = 0; i < n; i++) {
		printf("%s\n", buf[i]);
	}
	
}
