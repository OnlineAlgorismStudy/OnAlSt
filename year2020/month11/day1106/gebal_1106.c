#include<stdio.h>
#include<string.h>


int main() {

	char buf[101] = { 0 };
	char *p;
	int cnt = 1;

	gets_s(buf, sizeof(buf));

	p = strtok(buf, " ");
	while (p != NULL) {
		cnt++;
		if(cnt % 2 == 0)
			printf("%s\n", p);
		p = strtok(NULL, " ");
	}

	return 0;
}
