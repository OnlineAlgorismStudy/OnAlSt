#include<stdio.h>
#include<string.h>
#include<stdlib.h>
#include<ctype.h>

int main() {
	char buf[2][101];
	char tmp[2][101] = { "", "" };
	scanf("%s %s", buf[0], buf[1]);

	for (int i = 0; i < 2; i++) {
		for (unsigned int j = 0; j < strlen(buf[i]); j++) {
			if (!isdigit(buf[i][j])) {	
				strncpy(tmp[i], buf[i], j);
				break;
			}
		}
	}
	printf("%d", atoi(tmp[0]) * atoi(tmp[1]));

	
}
