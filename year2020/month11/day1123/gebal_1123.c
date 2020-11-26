#include<stdio.h>
#include<string.h>
#include<stdlib.h>

int main() {
	char buf[5][101];
	char temp[101];
	char *ptr;
	int cnt = 0;

	for (int i = 0; i < 5; i++) {
		scanf("%s", buf[i]);
	}

	while (1)
	{
		scanf("%s", temp);
		ptr = NULL;
		cnt = 0;
		for (int i = 0; i < 5; i++) {
			ptr = strstr(buf[i], temp);
			if (ptr != NULL) {
				printf("%s\n", buf[i]);
				cnt++;
			}
		}
		if (cnt == 0) {
			printf("none\n");
		}
	}
	
}
