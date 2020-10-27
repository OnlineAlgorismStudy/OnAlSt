#include<stdio.h>
#include<string.h>

int main() {
	char buf[101];
	int len = 0;
	scanf("%s", buf);
	len =  strlen(buf);
	for (int i = len-1; i >= 0; i--) {
		for (int j = 0; j < len; j++) {
			printf("%c", buf[(i + j)%(len)]);
		}
		printf("\n");
	}
	return 0;
}
