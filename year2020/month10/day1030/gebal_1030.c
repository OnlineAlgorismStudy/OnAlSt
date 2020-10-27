#include<stdio.h>
#include<string.h>

int main() {
	char buf[101];
	int len = 0;
	scanf("%s", buf);
	len =  strlen(buf);
	for (int i = 0; i < len; i++) {
		if ((buf[i] > 47 && buf[i] < 58) || (buf[i] > 96 && buf[i] < 123)) {
			printf("%c", buf[i]);
		}
		else if (buf[i] > 64 && buf[i] < 91) {
			printf("%c", buf[i] + 32);
		}
	}
	return 0;
}
