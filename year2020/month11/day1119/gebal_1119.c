#include<stdio.h>
#include<string.h>
#include<stdlib.h>

int main() {
	char buf[50][101];

	for (int i = 0; i < 50; i++) {
		scanf("%s", buf[i]);
		if (strcmp(buf[i], "0") == 0) {
			printf("%d\n", i);
			for (int j = 0; j < i; j++) {
				if(j % 2 == 0)
					printf("%s\n", buf[j]);
			}
			break;
		}
	}
}
