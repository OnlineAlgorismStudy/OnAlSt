#include<stdio.h>
#include<string.h>

void proc(char *p) {
	if (p == NULL) {
		printf("No ");
	}
	else {
		printf("Yes ");
	}
}

int main() {

	char buf[101] = { 0 };
	char *p;
	scanf("%s", buf);
	p = strstr(buf, "c");
	proc(p);
	p = strstr(buf, "ab");
	proc(p);

	return 0;
}
