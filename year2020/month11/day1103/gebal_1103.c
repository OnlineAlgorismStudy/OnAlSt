#include<stdio.h>
#include<string.h>

void proc(char* a, int pos) {
	char front[101] = { 0 }, end[101] = { 0 };
	strncpy(front, a, pos);
	strncpy(end, a + pos + 1, strlen(a) - pos);
	strcat(front, end);
	strcpy(a, front);
	printf("%s\n", a);
}

int main() {
	char buf[101];
	int len, pos;
	scanf("%s", buf);
	while (strlen(buf) > 1) {
		scanf("%d", &pos);
		if (pos == 0) {
			printf("%s\n", buf);
			break;
		}
		len = strlen(buf);
		if (pos > len) {
			proc(buf, len - 1);
		}
		else {
			proc(buf, pos-1);
		}
	}
	return 0;
}
