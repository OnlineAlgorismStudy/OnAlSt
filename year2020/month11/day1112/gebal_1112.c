#include<stdio.h>
#include<stdlib.h>
#include<string.h>


int main() {

	char buf[3][11] = { 0 };
	for (int i = 0; i < 3; i++) {
		scanf("%s", buf[i]);
	}
	qsort(buf, 3, 11, strcmp);
	printf("%s\n", buf[0]);
	return 0;
}
