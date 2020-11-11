#include<stdio.h>
#include<string.h>


int main() {
	char buf[101];
	char *p;
	int cnt = 1;
	gets_s(buf, 100);

	p = strtok(buf, " ");

	while (p != NULL) {
		printf("%d. %s\n", cnt++, p);
		p = strtok(NULL, " ");
	}

	return 0;
}
