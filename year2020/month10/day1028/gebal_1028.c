#include<stdio.h>
#include<string.h>

int main() {
	char buf[101];
	char *p;
	int cnt = 0;
	gets_s(buf, sizeof(buf));
	p = strtok(buf, " ");
	while (p != NULL) {
		cnt++;
		p = strtok(NULL, " ");
	}
	printf("%d", cnt);
	return 0;
}
